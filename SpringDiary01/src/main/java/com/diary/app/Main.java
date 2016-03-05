package com.diary.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.repository.AuthorRepository;

public class Main {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		AuthorRepository authorRepositoy = (AuthorRepository) context
				.getBean("authorRepository");
		//
//		System.out.println(authorRepositoy.count());
//		Iterator<Author> iter = authorRepositoy.findAll().iterator();
//		while (iter.hasNext()) {
//			Author author = iter.next();
//			List<TextKeeper> list = author.getTextKeepers();
//			for (TextKeeper textKeeper : list) {
//				if (textKeeper.getUser().getId() == 1) {
//					System.out.println(textKeeper.getAuthor().getSecondName());
//				}
//			}
//		}
		
		String name = authorRepositoy.findByFirstName("aa1").getSecondName();
		System.out.println(name);

		// System.out.println(authorRepositoy.exists(1));
		// // System.out.println(authorRepositoy.save(new Author()));
		//
	}
}
