package challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	final static String ARQUIVO_CSV = "/home/renata/codenation/java-3/src/main/resources/data.csv";
	final static String SEPARADOR = ",";

	public static void main(String[] args) {
		System.out.print(new Main().q6());
	}

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
		BufferedReader br = null;
		String linha = "";
		ArrayList<String> nacionalidades = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(ARQUIVO_CSV));
			linha = br.readLine();

			while ((linha = br.readLine()) != null)
				if (!nacionalidades.contains(linha.split(SEPARADOR)[14]))
					nacionalidades.add(linha.split(SEPARADOR)[14]);

			return nacionalidades.size();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
		BufferedReader br = null;
		String linha = "";
		ArrayList<String> clubes = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(ARQUIVO_CSV));
			linha = br.readLine();

			while ((linha = br.readLine()) != null)
				if (!clubes.contains(linha.split(SEPARADOR)[3]) && !linha.split(SEPARADOR)[3].isEmpty())
					clubes.add(linha.split(SEPARADOR)[3]);

			return clubes.size();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}

	// Liste o nome completo (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		BufferedReader br = null;
		String linha = "";
		ArrayList<String> fullNames = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(ARQUIVO_CSV));
			linha = br.readLine();

			for (int i = 0; i < 20; i++) {
				linha = br.readLine();
				fullNames.add(linha.split(SEPARADOR)[2]);
			}

			return fullNames;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		BufferedReader br = null;
		String linha = "";
		Map<Float, String> jogadores = new TreeMap<Float, String>(Collections.reverseOrder());
		ArrayList<String> dezJogadores = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(ARQUIVO_CSV));
			linha = br.readLine();

			while ((linha = br.readLine()) != null)
				if (!linha.split(SEPARADOR)[18].isEmpty())
					jogadores.put(Float.parseFloat(linha.split(SEPARADOR)[18]), linha.split(SEPARADOR)[2]);

			for (Map.Entry<Float, String> e : jogadores.entrySet())
				if (dezJogadores.size() < 10)
					dezJogadores.add(e.getValue());
				else
					break;

			return dezJogadores;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo
	// `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
		BufferedReader br = null;
		String linha = "";
		List<Jogador> jogadores = new ArrayList<>();
		SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
		List<String> dezJogadores = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(ARQUIVO_CSV));
			linha = br.readLine();

			while ((linha = br.readLine()) != null) {
				Jogador jogador = new Jogador();

				jogador.setFull_name(linha.split(SEPARADOR)[2]);
				try {
					jogador.setBith_date(formatador.parse(linha.split(SEPARADOR)[8]));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				jogador.setEur_wage(Double.parseDouble(linha.split(SEPARADOR)[17]));

				jogadores.add(jogador);
			}

			List<Jogador> jogadoresOrdenados = new ArrayList<>();
			jogadores.stream().sorted(Comparator.comparing(Jogador::getBith_date)).limit(10)
					.forEach(jogadoresOrdenados::add);

			for (int i = 0; i < jogadoresOrdenados.size(); i++)
				dezJogadores.add(jogadoresOrdenados.get(i).full_name);

			return dezJogadores;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde
	// as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		BufferedReader br = null;
		String linha = "";
		Map<Integer, Integer> jogadoresIdade = new HashMap<Integer, Integer>();

		try {
			br = new BufferedReader(new FileReader(ARQUIVO_CSV));
			linha = br.readLine();

			while ((linha = br.readLine()) != null) {
				int idade = Integer.parseInt(linha.split(SEPARADOR)[6]);
				if (jogadoresIdade.containsKey(idade))
					jogadoresIdade.replace(idade, jogadoresIdade.get(idade) + 1);
				else
					jogadoresIdade.put(idade, 1);
			}

			return jogadoresIdade;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
