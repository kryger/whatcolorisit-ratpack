package com.kryger.whatcolorisit;

import java.util.List;

/**
 * The server side implementation of the RPC service.
 */
public class ColourServiceImpl {

	private ColorParserService colorParser = new ColorParserService();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kryger.whatcolourisit.client.ColourFinderService#getSimilarColour
	 * (java.lang.String)
	 */
	public ColorResult getSimilarColor(String color)
			throws IllegalArgumentException {
		RgbColor original = colorParser.parseColor(color);

		List<ColorSimilarity> listOfSimilarColours = ColorDatabase
				.getMostSimilarColors(original, 1);

		ColorSimilarity mostSimilarColourSimilarity = listOfSimilarColours
				.get(0);

		RgbColor result = mostSimilarColourSimilarity.getColur();
		return new ColorResult(original, result,
				mostSimilarColourSimilarity.getSimilarity());
	}
}
