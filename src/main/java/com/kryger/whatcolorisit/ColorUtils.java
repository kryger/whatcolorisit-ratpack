package com.kryger.whatcolorisit;

public class ColorUtils {
	private final static float al = 1.4456f;
	private final static float ahInc = 0.16f;
	private final static int Y = 100;
	private static final double GAMMA = 3;
	private final static double piHalf = Math.PI / 2;

	private static double atanAlternative(double y, double x) {
		if (x == 0) {
			if (y < 0) {
				return -piHalf;
			} else {
				return piHalf;
			}
		}
		return Math.atan(y / x);
	}

	public static HclColor rgb2hcl(RgbColor rgbColor) {
		int min = Math.min(Math.min(rgbColor.getRed(), rgbColor.getGreen()),
				rgbColor.getBlue());
		int max = Math.max(Math.max(rgbColor.getRed(), rgbColor.getGreen()),
				rgbColor.getBlue());

		if (max == 0) {
			return new HclColor(rgbColor.getName(), 0, 0, 0);
		}

		double alpha = (min / (double) max) / Y;

		double q = Math.exp(alpha * GAMMA);

		double l = (q * max + (1 - q) * min) / 2;

		int rG = rgbColor.getRed() - rgbColor.getGreen();
		int gB = rgbColor.getGreen() - rgbColor.getBlue();
		int bR = rgbColor.getBlue() - rgbColor.getRed();
		double c = q * (Math.abs(rG) + Math.abs(gB) + Math.abs(bR)) / 3;
		double h = atanAlternative(gB, rG);

		if (rG >= 0 && gB >= 0) {
			h = h * 2 / 3;
		} else if (rG >= 0 && gB < 0) {
			h = h * 4 / 3;
		} else if (rG < 0 && gB >= 0) {
			h = 180 + 4 / 3 * h;
		} else if (rG < 0 && gB < 0) {
			h = 2 / 3 * h - 180;
		}

		return new HclColor(rgbColor.getName(), h, c, l);
	}

	public static double compareColorsHcl(HclColor c1, HclColor c2) {
		double aH = Math.abs(c1.getH() - c2.getH()) + ahInc;
		double deltaL = Math.abs(c1.getL() - c2.getL());
		double deltaH = Math.abs(c1.getH() - c2.getH());

		double result = Math.sqrt(Math.pow(al * deltaL, 2)
				+ aH
				* (Math.pow(c1.getC(), 2) + Math.pow(c2.getC(), 2) - 2
						* c1.getC() * c2.getC() * Math.cos(deltaH)));
		return result;
	}

	public static double compareColorsRgb(RgbColor c1, RgbColor c2) {
		return compareColorsHcl(rgb2hcl(c1), rgb2hcl(c2));
	}

}
