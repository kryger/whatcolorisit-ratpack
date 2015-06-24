package com.kryger.whatcolorisit;

public class HclColor {
	private final String name;
	private final Double h;
	private final Double c;
	private final Double l;

	/**
	 * @param h
	 * @param c
	 * @param l
	 */
	public HclColor(String name, double h, double c, double l) {
		this.name = name;
		this.h = h;
		this.c = c;
		this.l = l;
	}

	public double getH() {
		return h;
	}

	public double getC() {
		return c;
	}

	public double getL() {
		return l;
	}

	public String getName() {
		return name;
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof HclColor)) {
			return false;
		}
		HclColor rhs = (HclColor) object;

		return (this.h.equals(rhs.getH()) && this.c.equals(rhs.getC()) && this.l
				.equals(rhs.getL()));
	}

	@Override
	public int hashCode() {
		int hashCode = -37;
		hashCode = -37 * h.hashCode();
		hashCode = -37 * c.hashCode();
		hashCode = -37 * l.hashCode();
		return hashCode;
	}
}
