package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Lesson> lista = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da "+ i +"a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char op = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.nextLine();
			String title = sc.nextLine();
			if(op == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				lista.add(new Video(title, url, seconds));
			}
			else {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				lista.add(new Task(title, description, questionCount));
			}
			System.out.println();
		}
		
		System.out.println();
		int total = 0;
		for(Lesson l: lista) {
			total += l.duration();
		}
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + total + " segundos");

		
		sc.close();
	}

}
