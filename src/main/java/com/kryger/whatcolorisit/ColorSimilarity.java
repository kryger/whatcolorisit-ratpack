package com.kryger.whatcolorisit;

public class ColorSimilarity implements Comparable<ColorSimilarity> {
	private final RgbColor color;
	private final Double similarity;

	public ColorSimilarity(RgbColor color, Double similarity) {
		this.color = color;
		this.similarity = similarity;
	}

	public RgbColor getColur() {
		return color;
	}

	public Double getSimilarity() {
		return similarity;
	}

	@Override
	public int compareTo(ColorSimilarity arg0) {
		return this.similarity.compareTo(arg0.getSimilarity());
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ColorSimilarity)) {
			return false;
		}
		ColorSimilarity rhs = (ColorSimilarity) object;
		return this.similarity.equals(rhs.getSimilarity());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return similarity.hashCode();
	}
}
