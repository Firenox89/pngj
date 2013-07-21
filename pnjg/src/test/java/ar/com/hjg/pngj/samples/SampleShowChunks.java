package ar.com.hjg.pngj.samples;

import java.io.File;

import ar.com.hjg.pngj.PngReaderDummy;
import ar.com.hjg.pngj.test.TestSupport;

/**
 * prints chunks list
 */
public class SampleShowChunks {
	
	public static void showChunks(String file, boolean includeidat) {

		PngReaderDummy png = new PngReaderDummy(new File(file));
		png.setIncludeIdat(includeidat);
		png.readAll();
		for (int i = 0; i < png.getChunks().size(); i++) {
			System.out.println("Chunk " + (i + 1) + ": " + png.getChunks().get(i));
		}
	}

	public static void main(String[] args) throws Exception {
		showChunks(TestSupport.PNG_TEST_STRIPES, true);
	}
}