package com.skiloote.ui;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.skiloote.util.Log;

@SuppressWarnings("unlikely-arg-type")
public class Icone {
	
	public static final Map<Integer, ImageIcon> MAPA_DE_ICONES = new HashMap<Integer, ImageIcon>();
	public static final ImageIcon NAO_MOSTRAR = new ImageIcon(Icone.class.getResource("/icones/icone-nao-mostrar.png"));
	
	static {
		
		Log.i("**** Iniciando o carregamento de icones ****");
		
		try (Stream<Path> paths = Files.walk(Paths.get(Icone.class.getResource("/icones/").toURI()))) {
			
			final List<Path> arquivos = paths.filter(Files::isRegularFile).collect(Collectors.toList());
			
			for (int i = 0; i < arquivos.size(); i++) {
				final File arquivo = arquivos.get(i).toFile();
				MAPA_DE_ICONES.put(i, new ImageIcon(ImageIO.read(arquivo)));
			}

			MAPA_DE_ICONES.remove(NAO_MOSTRAR);
		}
		catch (Exception e) {
			Log.e("**** Erro ao carregar imagens de icones ****");
			e.printStackTrace();
		}

	}
	
	/**
	 * Get
	 * 
	 * @param i
	 * @return
	 */
	public static ImageIcon get(int i) {
		return MAPA_DE_ICONES.get(i);
	}
	
}
