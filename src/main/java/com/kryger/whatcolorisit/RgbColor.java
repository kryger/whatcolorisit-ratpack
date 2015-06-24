package com.kryger.whatcolorisit;

public class RgbColor {
	private final String name;
	private final int red;
	private final int green;
	private final int blue;

	public RgbColor(String name, int red, int green, int blue) {
		this.name = name;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + "(" + red + "," + green + "," + blue + ")";
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int hashCode = -37;
		hashCode = -37 * red;
		hashCode = -37 * green;
		hashCode = -37 * blue;
		return hashCode;
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RgbColor)) {
			return false;
		}
		RgbColor rhs = (RgbColor) object;

		return (this.red == rhs.red && this.blue == rhs.blue && this.green == rhs.green);
	}

	public String getColourAsHtml() {

		String redHex = Integer.toHexString(red);
		if (redHex.length() == 1) {
			redHex = "0" + redHex;
		}

		String greenHex = Integer.toHexString(green);
		if (greenHex.length() == 1) {
			greenHex = "0" + greenHex;
		}
		String blueHex = Integer.toHexString(blue);
		if (blueHex.length() == 1) {
			blueHex = "0" + blueHex;
		}

		return "#" + redHex + greenHex + blueHex;
	}
}
