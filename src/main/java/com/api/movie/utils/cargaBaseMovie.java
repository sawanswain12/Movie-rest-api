package com.api.movie.utils;

import java.util.Arrays;

import com.api.movie.dto.GivenBaseDTO;
import com.api.movie.dto.InfoDTO;
import com.api.movie.dto.MovieDTO;
import com.api.movie.model.GivenBase;
import com.api.movie.model.Info;
import com.api.movie.model.Movie;
import com.api.movie.repository.GivenBaseRepository;
import com.api.movie.repository.InfoRepository;
import com.api.movie.repository.MovieRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class cargaBaseMovie {

	private MovieRepository repositoryMovie;
	private InfoRepository infoRepository;
	private GivenBaseRepository givenBaseRepository;
	private ModelMapper mapper;

	public cargaBaseMovie(MovieRepository repositoryMovie, InfoRepository infoRepository,
			GivenBaseRepository givenBaseRepository, ModelMapper mapper) {
		this.repositoryMovie = repositoryMovie;
		this.infoRepository = infoRepository;
		this.givenBaseRepository = givenBaseRepository;
		this.mapper = mapper;
	}

	public void cargaService() {
		MovieDTO m1 = new MovieDTO();
		m1.setId(1l);
		m1.setNome("Rango");
		m1.setImagem("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSTtmLfwxfgjuexYD4IBRvrF6Lzgs-jAeTLU8GKTFzES6Jm8S1s");
		m1.setDataLancamento("09-03-2022");
		m1.setFavorito(false);
		m1.setDescricao("The adventure story of Rango, a captive chameleon living a normal pet life while facing a huge identity crisis. After all, what's the use of dreaming big if we know our purpose in life is to blend in? When Rango accidentally finds himself in the sandy and 'nervous' Dirt Town – a lawless place inhabited by the smartest and quirkiest desert creatures – the not-so-brave lizard quickly realizes he's different.");
		InfoDTO i1 = new InfoDTO();
		i1.setId(1l);
		i1.setAno("2011");
		i1.setAutor("Gore Verbinski,John Logan ,James Byrkit");
		i1.setElenco("Johnny Depp, Isla Fisher, Bill Nighy, Abigail Breslin, Alfred Molina, Harry Dean Stanton, Ray Winstone, Ned Beatty e Timothy Olyphant");
		i1.setGenero("Western, Adventure, Comedy, Action");
		GivenBaseDTO g1 = new GivenBaseDTO();
		g1.setId(1l);
		g1.setDirecao("Gore Verbinski");
		g1.setEmissora("Paramount Pictures");
		g1.setTipo("Animation");
		g1.setUrlTrilerVideo("https://www.youtube.com/watch?v=LwSfIbBH8Pw");

		MovieDTO m2 = new MovieDTO();
		m2.setId(2l);
		m2.setNome("Cruella");
		m2.setImagem("https://wallpapercave.com/wp/wp9436533.jpg");
		m2.setDataLancamento("27-05-2021");
		m2.setFavorito(false);
		m2.setDescricao("Intelligent, creative, and determined, Estella wants to make a name for herself through her designs and catches the attention of the Baroness Von Hellman. However, their relationship triggers a series of events and revelations that lead Estella to embrace her rebellious side and become Cruella, a stylish and revenge-driven individual.");
		InfoDTO i2 = new InfoDTO();
		i2.setId(2l);
		i2.setAno("2021");
		i2.setAutor("Dodie Smith");
		i2.setElenco("Emma Stone ,Emma Thompson , Paul Walter Hauser ,Joel Fry  ,Mark Strong  ,Emily Beecham ,Kirby Howell-Baptiste ,Jamie Demetriou,John McCrea ");
		i2.setGenero("Adventure, Comedy, Family");
		GivenBaseDTO g2 = new GivenBaseDTO();
		g2.setId(2l);
		g2.setDirecao("Craig Gillespie");
		g2.setEmissora("Disney+");
		g2.setTipo("Crime,Adventure");
		g2.setUrlTrilerVideo("https://youtu.be/tflvpp467hc");

		MovieDTO m3 = new MovieDTO();
		m3.setId(3l);
		m3.setNome("Arrival");
		m3.setImagem("https://2.bp.blogspot.com/-H2Ga0r9DewQ/WDxsJ26F9yI/AAAAAAAAVcQ/2TwT-OB5eC0gl1Wi-epoHLbtZnKzi8N7ACLcB/s1600/A%2BChegada%2B01.jpg");
		m3.setDataLancamento("22-11-2016");
		m3.setFavorito(true);
		m3.setDescricao("Alien spaceships have arrived in major cities around the world. With the intention of communicating with the visitors, a linguist and a military officer are called to decipher the strange messages from the visitors.");
		InfoDTO i3 = new InfoDTO();
		i3.setId(3l);
		i3.setAno("2016");
		i3.setAutor("Ted Chiang");
		i3.setElenco("Amy Adams  \n"
				+ "Forest Whitaker  \n"
				+ "Michael Stuhlbarg  \n"
				+ "Tzi Ma  \n"
				+	 "Mark O'Brien  \n"
				+ "Abigail Pniowsky  \n"
				+ "Julia Scarlett Dan \n"
				+ "Jadyn Malone  \n"
				+ "Frank Schorpion  ");
		i3.setGenero("Science Fiction, Drama, Adventure, Thriller");

		GivenBaseDTO g3 = new GivenBaseDTO();
		g3.setId(3l);
		g3.setDirecao("Denis Villeneuve");
		g3.setEmissora("Paramount Pictures");
		g3.setTipo("Science Fiction");
		g3.setUrlTrilerVideo("https://youtu.be/isWwUJf4KEA");

		MovieDTO m4 = new MovieDTO();
		m4.setId(4l);
		m4.setNome("Interstellar");
		m4.setImagem("https://m.media-amazon.com/images/I/71qzTzxzoCL.jpg");
		m4.setDataLancamento("06-11-2014");
		m4.setFavorito(false);
		m4.setDescricao("Earth's natural resources are running out, and a group of astronauts is tasked with finding potential planets to sustain the world's population, ensuring the continuation of the human species. Cooper is called to lead the group and accepts the mission, knowing he may never see his children again.");
		InfoDTO i4 = new InfoDTO();
		i4.setId(4l);
		i4.setAno("2014");
		i4.setAutor("Christopher Nolan,Jonathan Nolan");
		i4.setElenco("Matthew McConaughey, Anne Hathaway, Jessica Chastain, Bill Irwin, Mackenzie Foy, Matt Damon, John Lithgow , Michael Caine.");
		i4.setGenero("Adventure, Drama, Science Fiction");
		GivenBaseDTO g4 = new GivenBaseDTO();
		g4.setId(4l);
		g4.setDirecao("Christopher Nolan");
		g4.setEmissora("Paramount Pictures ,Warner Bros. Pictures");
		g4.setTipo("Science Fiction");
		g4.setUrlTrilerVideo("https://www.youtube.com/watch?v=mbbPSq63yuM");

		
		
		MovieDTO m5 = new MovieDTO();
		m5.setId(5l);
		m5.setNome("WALL-E");
		m5.setImagem("https://lumiere-a.akamaihd.net/v1/images/p_walle_19753_69f7ff00.jpeg");
		m5.setDataLancamento("27-06-2008");
		m5.setFavorito(false);
		m5.setDescricao("After humanity leaves Earth due to pollution, WALL-E, the last robot on the planet, spends his days compacting the waste left behind. His lonely life changes when a new robot named Eve arrives, and WALL-E embarks on a journey across the galaxy.");
		InfoDTO i5= new InfoDTO();
		i5.setId(5l);
		i5.setAno("2008");
		i5.setAutor("Andrew Stanton; Pete Docter");
		i5.setElenco("	\n"
				+ "Ben Burtt\n"
				+ "Elissa Knight\n"
				+ "Jeff Garlin\n"
				+ "Fred Willard\n"
				+ "John Ratzenberger\n"
				+ "Kathy Najimy\n"
				+ "Sigourney Weaver\n"
				+ "MacInTalk");
		i5.setGenero("ficção científica, comédia");
		GivenBaseDTO g5 = new GivenBaseDTO();
		g5.setId(5l);
		g5.setDirecao("Andrew Stanton");
		g5.setEmissora("Disney+");
		g5.setTipo("Science Fiction");
		g5.setUrlTrilerVideo("https://youtu.be/m5_lIuBXKWk");
	
 
		
		
		MovieDTO m6 = new MovieDTO();
		m6.setId(6l);
		m6.setNome("Lucy");
		m6.setImagem("https://br.web.img3.acsta.net/pictures/14/06/12/15/31/228587.jpg");
		m6.setDataLancamento("28-08-2014");
		m6.setFavorito(false);
		m6.setDescricao("Lucy is forced to smuggle drugs in her stomach, but her body absorbs the substances, giving her superhuman abilities such as telepathy, telekinesis, insensitivity to pain, and rapid knowledge acquisition.");
		InfoDTO i6 = new InfoDTO();
		i6.setId(6l);
		i6.setAno("2014");
		i6.setAutor("Luc Besson");
		i6.setElenco(" Bertrand Quoniam · Jan Oliver Schroeder · Julian Rhind-Tutt · Loïc Brabant · Luca Angeletti · Min-sik Choi · Nicolas Phongpheth · Pascal Loison");
		i6.setGenero("Science Fiction, Drama, Action");
		GivenBaseDTO g6 = new GivenBaseDTO();
		g6.setId(6l);
		g6.setDirecao("Luc Besson");
		g6.setEmissora("CBS");
		g6.setTipo("Science Fiction");
		g6.setUrlTrilerVideo("https://youtu.be/1oJR6Di0Eck");

		
		
		MovieDTO m7 = new MovieDTO();
		m7.setId(7l);
		m7.setNome("The Incredibles");
		m7.setImagem("https://cineclick-static.flixmedia.cloud/480/processed/69/1080x1620_1588165592.webp");
		m7.setDataLancamento("10-12-2004");
		m7.setFavorito(false);
		m7.setDescricao("After the government bans the use of superpowers, the world's greatest hero, Mr. Incredible, lives a quiet life with his family. Despite being content with domestic life, Mr. Incredible still longs for the days when he was a superhero, and his opportunity to return to action suddenly arises.");
		InfoDTO i7 = new InfoDTO();
		i7.setId(7l);
		i7.setAno("2004");
		i7.setAutor("Brad Bird");
		i7.setElenco("Craig T. Nelson, Holly Hunter, Samuel L. Jackson, Jason Lee, Sarah Vowell e Brad Bird");
		i7.setGenero("Animation,Action,Science Fiction");
		GivenBaseDTO g7 = new GivenBaseDTO();
		g7.setId(7l);
		g7.setDirecao("Brad Bird");
		g7.setEmissora("Disney,Pixar");
		g7.setTipo("Animation");
		g7.setUrlTrilerVideo("https://youtu.be/W33ZopI8YaE");
	
		
		
		MovieDTO m8 = new MovieDTO();
		m8.setId(8l);
		m8.setNome("Shrek");
		m8.setImagem("https://m.media-amazon.com/images/I/71wfvHXxvYL.jpg");
		m8.setDataLancamento("22-06-2001");
		m8.setFavorito(false);
		m8.setDescricao("An ogre has his life invaded by fairytale characters who destroy the tranquility of his home. He makes a deal to rescue a princess.");
		InfoDTO i8 = new InfoDTO();
		i8.setId(8l);
		i8.setAno("2001");
		i8.setAutor("William Steig");
		i8.setElenco("William Steig · Rupert Everett · Mike Myers · Eddie Murphy · Cameron Diaz · Antonio Banderas · Julie Andrews");
		i8.setGenero("Adventure,Drama,Romance");
		GivenBaseDTO g8 = new GivenBaseDTO();
		g8.setId(8l);
		g8.setDirecao("Andrew Adamson; ‎Vicky Jenson");
		g8.setEmissora("DreamWorks");
		g8.setTipo("Animation");
		g8.setUrlTrilerVideo("https://www.youtube.com/watch?v=CwXOrWvPBPk");
	
		
		MovieDTO m9 = new MovieDTO();
		m9.setId(9l);
		m9.setNome("Zootopia: This City Is the Beast");
		m9.setImagem("https://br.web.img3.acsta.net/r_1280_720/pictures/17/12/27/23/58/5850500.jpg");
		m9.setDataLancamento("17-03-2016");
		m9.setFavorito(false);
		m9.setDescricao("In a city of animals, a talking fox becomes a fugitive after being accused of a crime he didn't commit. The main police officer of the place, the undisputed rabbit, goes in search of her.");
		InfoDTO i9 = new InfoDTO();
		i9.setId(9l);
		i9.setAno("2016");
		i9.setAutor("Rich Moore,Byron Howard,Phil Johnston,Josie Trinidad , Jared Bush, Jennifer Lee, Jim Reardon, Nancy Kruse");
		i9.setElenco("Ginnifer Goodwin · Jason Bateman · Shakira · Idris Elba");
		i9.setGenero("Animation,Adventure");
		GivenBaseDTO g9 = new GivenBaseDTO();
		g9.setId(9l);
		g9.setDirecao("Byron Howard, Rich Moore");
		g9.setEmissora("Disney");
		g9.setTipo("Animation");
		g9.setUrlTrilerVideo("https://www.youtube.com/watch?v=prct6AB5tR8");
	
		
 		MovieDTO m10 = new MovieDTO();
 		m10.setId(10l);
		m10.setNome("Coraline");
		m10.setImagem("https://m.media-amazon.com/images/I/81lU6I-SGDL.jpg");
		m10.setDataLancamento("13-02-2009");
		m10.setFavorito(false);
		m10.setDescricao("While exploring her new home at night, little Coraline discovers a secret door that contains a world similar to hers, but better in many ways. Everyone has buttons for eyes, the parents are loving and Coraline's dreams come true there. She is delighted with this discovery");
		InfoDTO i10 = new InfoDTO();
		i10.setId(10l);
		i10.setAno("2009");
		i10.setAutor("Neil Gaiman");
		i10.setElenco("Dakota Fanning · Aankha Neal · Carolyn Crawford · Christopher Murrie · Dawn French · Emerson Hatcher");
		i10.setGenero("Animation,Horror,Adventure,Intriguing");
		GivenBaseDTO g10 = new GivenBaseDTO();
		g10.setId(10l);
		g10.setDirecao("Henry Selick");
		g10.setEmissora("Laika");
		g10.setTipo("Animation");
		g10.setUrlTrilerVideo("https://www.youtube.com/watch?v=P8lfdvXkhu0");
	
		
		MovieDTO m1d = mapper.map(m1, MovieDTO.class);
		InfoDTO ifd = mapper.map(i1, InfoDTO.class);
		GivenBaseDTO gb1 = mapper.map(g1, GivenBaseDTO.class);
		
		MovieDTO m2d = mapper.map(m2, MovieDTO.class);
		InfoDTO i2fd = mapper.map(i2, InfoDTO.class);
		GivenBaseDTO gb2 = mapper.map(g2, GivenBaseDTO.class);
		
		MovieDTO m3d = mapper.map(m3, MovieDTO.class);
		InfoDTO i3fd = mapper.map(i3, InfoDTO.class);
		GivenBaseDTO gb3 = mapper.map(g3, GivenBaseDTO.class);
		
		MovieDTO m4d = mapper.map(m4, MovieDTO.class);
		InfoDTO i4fd = mapper.map(i4, InfoDTO.class);
		GivenBaseDTO gb4 = mapper.map(g4, GivenBaseDTO.class);
		
		MovieDTO m5d = mapper.map(m5, MovieDTO.class);
		InfoDTO i5fd = mapper.map(i5, InfoDTO.class);
		GivenBaseDTO gb5 = mapper.map(g5, GivenBaseDTO.class);
		
		MovieDTO m6d = mapper.map(m6, MovieDTO.class);
		InfoDTO i6fd = mapper.map(i6, InfoDTO.class);
		GivenBaseDTO gb6 = mapper.map(g6, GivenBaseDTO.class);
		
		MovieDTO m7d = mapper.map(m7, MovieDTO.class);
		InfoDTO i7fd = mapper.map(i7, InfoDTO.class);
		GivenBaseDTO gb7 = mapper.map(g7, GivenBaseDTO.class);
		
		MovieDTO m8d = mapper.map(m8, MovieDTO.class);
		InfoDTO i8fd = mapper.map(i8, InfoDTO.class);
		GivenBaseDTO gb8 = mapper.map(g8, GivenBaseDTO.class);
		
		MovieDTO m9d = mapper.map(m9, MovieDTO.class);
		InfoDTO i9fd = mapper.map(i9, InfoDTO.class);
		GivenBaseDTO gb9 = mapper.map(g9, GivenBaseDTO.class);
		
		MovieDTO m10d = mapper.map(m10, MovieDTO.class);
		InfoDTO i10fd = mapper.map(i10, InfoDTO.class);
		GivenBaseDTO gb10 = mapper.map(g10, GivenBaseDTO.class);
		
  

		repositoryMovie.saveAll(Arrays.asList(mapper.map(m1d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(ifd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb1, GivenBase.class)));
		

		repositoryMovie.saveAll(Arrays.asList(mapper.map(m2d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i2fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb2, GivenBase.class)));
		

		repositoryMovie.saveAll(Arrays.asList(mapper.map(m3d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i3fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb3, GivenBase.class)));
		

		repositoryMovie.saveAll(Arrays.asList(mapper.map(m4d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i4fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb4, GivenBase.class)));
		
		repositoryMovie.saveAll(Arrays.asList(mapper.map(m5d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i5fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb5, GivenBase.class)));
		
		repositoryMovie.saveAll(Arrays.asList(mapper.map(m6d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i6fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb6, GivenBase.class)));
		
		repositoryMovie.saveAll(Arrays.asList(mapper.map(m7d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i7fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb7, GivenBase.class)));
		
		repositoryMovie.saveAll(Arrays.asList(mapper.map(m8d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i8fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb8, GivenBase.class)));
		
		repositoryMovie.saveAll(Arrays.asList(mapper.map(m9d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i9fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb9, GivenBase.class)));
		
		repositoryMovie.saveAll(Arrays.asList(mapper.map(m10d, Movie.class)));
		infoRepository.saveAll(Arrays.asList(mapper.map(i10fd, Info.class)));
		givenBaseRepository.saveAll(Arrays.asList(mapper.map(gb10, GivenBase.class)));

	}
}

