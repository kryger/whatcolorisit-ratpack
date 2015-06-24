package com.kryger.whatcolorisit;

public class ColorResult {
	private final RgbColor original;
	private final RgbColor result;
	private final double similarity;

	public ColorResult(RgbColor original, RgbColor result, double similarity) {
		this.original = original;
		this.result = result;
		this.similarity = similarity;
	}

	public RgbColor getOriginal() {
		return original;
	}

	public RgbColor getResult() {
		return result;
	}

	public double getSimilarity() {
		return similarity;
	}
}
