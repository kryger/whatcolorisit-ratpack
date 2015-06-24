package com.kryger.whatcolorisit;

public class ColorParserService {

	public RgbColor parseColor(String colorString) {
		colorString = colorString.trim().toLowerCase();

		int r = -1;
		int g = -1;
		int b = -1;

		/*
		 * case 0 - HEX. Only if starts with # and/or contains A/B/C/D/E/F
		 */
		if (colorString.contains("a") || colorString.contains("b")
				|| colorString.contains("c") || colorString.contains("d")
				|| colorString.contains("e") || colorString.contains("f")
				|| colorString.startsWith("#")

		) {
			if (colorString.startsWith("#")) {
				colorString = colorString.substring(1);
			}

			if (colorString.length() == 6) {
				try {
					String rString = colorString.substring(0, 2);
					r = Integer.parseInt(rString, 16);
					String gString = colorString.substring(2, 4);
					g = Integer.parseInt(gString, 16);
					String bString = colorString.substring(4, 6);
					b = Integer.parseInt(bString, 16);
				} catch (NumberFormatException e) {
					throw new IllegalArgumentException("illegal r,g,b="
							+ colorString);
				}
			} else if (colorString.length() == 3) {
				String rString = String.valueOf(colorString.charAt(0));
				rString += rString;
				r = Integer.parseInt(rString, 16);
				String gString = String.valueOf(colorString.charAt(1));
				gString += gString;
				g = Integer.parseInt(gString, 16);
				String bString = String.valueOf(colorString.charAt(2));
				bString += bString;
				b = Integer.parseInt(bString, 16);
			} else {
				throw new IllegalArgumentException("Wrong length");
			}
			return new RgbColor(null, r, g, b);
		}

		/*
		 * case 1 - comma separated
		 */
		if (colorString.contains(",")) {
			String[] rgb = colorString.split(",");
			if (rgb.length != 3) {
				throw new IllegalArgumentException("illegal length="
						+ colorString);
			}

			/*
			 * case 1a r,g,b
			 */
			try {
				r = Integer.parseInt(rgb[0].trim());
				g = Integer.parseInt(rgb[1].trim());
				b = Integer.parseInt(rgb[2].trim());
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("illegal r,g,b="
						+ colorString);
			}
			if (r < 0 || r > 255) {
				throw new IllegalArgumentException("R not in 0,255");
			}
			if (g < 0 || g > 255) {
				throw new IllegalArgumentException("G not in 0,255");
			}
			if (b < 0 || b > 255) {
				throw new IllegalArgumentException("B not in 0,255");
			}

			return new RgbColor(null, r, g, b);
		}

		/*
		 * case 2 space separated
		 */
		if (colorString.contains(" ")) {
			String[] rgb = colorString.split(" ");
			if (rgb.length != 3) {
				throw new IllegalArgumentException("illegal length="
						+ colorString);
			}

			/*
			 * case 1a r,g,b
			 */
			try {
				r = Integer.parseInt(rgb[0].trim());
				g = Integer.parseInt(rgb[1].trim());
				b = Integer.parseInt(rgb[2].trim());
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("illegal r,g,b="
						+ colorString);
			}
			if (r < 0 || r > 255) {
				throw new IllegalArgumentException("R not in 0,255");
			}
			if (g < 0 || g > 255) {
				throw new IllegalArgumentException("G not in 0,255");
			}
			if (b < 0 || b > 255) {
				throw new IllegalArgumentException("B not in 0,255");
			}

			return new RgbColor(null, r, g, b);
		}

		throw new IllegalArgumentException("Unable to match any color parser");
	}
}
