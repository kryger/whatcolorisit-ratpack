package com.kryger.whatcolorisit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColorDatabase {
	public static List<ColorSimilarity> getMostSimilarColors(RgbColor in,
			int limit) {
		List<ColorSimilarity> colourSimilarityList = new ArrayList<ColorSimilarity>();

		for (RgbColor colour : LIST_OF_RGB_COLOURS) {
			double similarity = ColorUtils.compareColorsRgb(colour, in);
			colourSimilarityList.add(new ColorSimilarity(colour, similarity));
		}

		Collections.sort(colourSimilarityList);
		if (limit > colourSimilarityList.size()) {
			limit = colourSimilarityList.size();
		}
		return colourSimilarityList.subList(0, limit);
	}

	private final static Set<RgbColor> LIST_OF_RGB_COLOURS;
	static {
		LIST_OF_RGB_COLOURS = new HashSet<RgbColor>();
		LIST_OF_RGB_COLOURS.add(new RgbColor("Air Force blue", 93, 138, 168));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Alice blue", 240, 248, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Alizarin", 227, 38, 54));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Almond", 239, 222, 205));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amaranth", 229, 43, 80));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amaranth cerise", 205, 38, 130));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amaranth deep purple", 159, 43,
				104));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amaranth magenta", 237, 60, 202));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amaranth pink", 241, 156, 187));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amaranth purple", 171, 39, 79));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amber", 255, 191, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amber (SAE/ECE)", 255, 126, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("American rose", 255, 3, 62));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Amethyst", 153, 102, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Android Green", 164, 198, 57));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Anti-flash white", 242, 243, 244));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Antique brass", 205, 149, 117));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Antique fuchsia", 145, 92, 131));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Antique white", 250, 235, 215));
		// LIST_OF_RGB_COLOURS.add(new RgbColour("Ao", 0, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ao (English)", 0, 128, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Apple green", 141, 182, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Apricot", 251, 206, 177));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Aqua", 0, 255, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Aquamarine", 127, 255, 212));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Army green", 75, 83, 32));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Arsenic", 59, 68, 75));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Arylide yellow", 233, 214, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ash grey", 178, 190, 181));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Asparagus", 135, 169, 107));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Atomic tangerine", 255, 153, 102));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Auburn", 109, 53, 26));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Aureolin", 253, 238, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("AuroMetalSaurus", 110, 127, 128));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Azure (color wheel)", 0, 127, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Azure (web) (Azure mist)", 240,
				255, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Baby blue", 137, 207, 240));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Baby pink", 244, 194, 194));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ball Blue", 33, 171, 205));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Banana yellow", 255, 209, 42));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Battleship grey", 132, 132, 130));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Beige", 245, 245, 220));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bistre", 61, 43, 31));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bittersweet", 254, 111, 94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Black", 0, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blanched Almond", 255, 235, 205));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bleu de France", 49, 140, 231));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blizzard Blue", 172, 229, 238));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blond", 250, 240, 190));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue", 0, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue (pigment)", 51, 51, 153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue (RYB)", 2, 71, 254));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue Bell", 162, 162, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue Gray", 162, 162, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue-green", 102, 153, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue-violet", 138, 43, 226));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bole", 121, 68, 59));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bondi blue", 0, 149, 182));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Boston University Red", 204, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brandeis Blue", 0, 112, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brass", 181, 166, 66));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brick red", 203, 65, 84));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bright cerulean", 29, 172, 214));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bright green", 102, 255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bright lavender", 191, 148, 228));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bright maroon", 195, 33, 72));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bright pink", 255, 0, 127));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bright turquoise", 8, 232, 222));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bright ube", 209, 159, 232));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brilliant lavender", 244, 187,
				255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brilliant rose", 255, 85, 163));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brink pink", 251, 96, 127));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("British racing green", 0, 66, 37));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bronze", 205, 127, 50));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Brown (traditional)", 150, 75, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brown (web)", 165, 42, 42));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bubble gum", 252, 193, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Buff", 240, 220, 130));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bulgarian rose", 72, 6, 7));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Burgundy", 128, 0, 32));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Burnt orange", 204, 85, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Burnt sienna", 233, 116, 81));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Burnt umber", 138, 51, 36));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Byzantine", 189, 51, 164));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Byzantium", 112, 41, 99));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cadet blue", 95, 158, 160));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cadmium Green", 0, 107, 60));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cadmium Orange", 237, 135, 45));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cadmium Red", 227, 0, 34));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cadmium Yellow", 255, 246, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cambridge Blue", 153, 204, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Camel", 193, 154, 107));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Camouflage green", 120, 134, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Canary yellow", 255, 239, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Candy apple red", 255, 8, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Candy pink", 228, 113, 122));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Capri", 0, 191, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Caput mortuum", 89, 39, 32));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cardinal", 196, 30, 58));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Carmine", 150, 0, 24));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Carmine pink", 235, 76, 66));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Carmine red", 255, 0, 56));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Carnation pink", 255, 166, 201));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Carnelian", 179, 27, 27));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Carolina blue", 153, 186, 227));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Caribbean green", 0, 204, 153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Carrot orange", 237, 145, 33));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ceil", 146, 161, 207));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Celadon", 172, 225, 175));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Celestial blue", 73, 151, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cerise", 222, 49, 99));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cerise pink", 236, 59, 131));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cerulean", 0, 123, 167));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cerulean blue", 42, 82, 190));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Chamoisee", 160, 120, 90));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Champagne", 247, 231, 206));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Charcoal", 54, 69, 79));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Chartreuse (traditional)", 223,
				255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Chartreuse (web)", 127, 255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cherry blossom pink", 255, 183,
				197));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Chestnut", 205, 92, 92));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Chocolate", 123, 63, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Chrome yellow", 255, 167, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cinereous", 152, 129, 123));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cinnabar", 227, 66, 52));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cinnamon", 210, 105, 30));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Citrine", 228, 208, 10));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Classic rose", 251, 204, 231));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cobalt", 0, 71, 171));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Columbia blue", 155, 221, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cool black", 0, 46, 99));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cool grey", 140, 146, 172));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Copper", 184, 115, 51));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Copper rose", 153, 102, 102));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Coquelicot", 255, 56, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Coral", 255, 127, 80));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Coral pink", 248, 131, 121));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Coral red", 255, 64, 64));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cordovan", 137, 63, 69));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Corn", 251, 236, 93));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cornsilk", 255, 248, 220));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cornflower blue", 100, 149, 237));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cosmic", 118, 57, 93));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cosmic latte", 255, 248, 231));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cotton candy", 255, 188, 217));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cream", 255, 253, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Crimson", 220, 20, 60));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Crimson glory", 190, 0, 50));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cyan", 0, 255, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cyan (process)", 0, 183, 235));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Daffodil", 255, 255, 49));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dandelion", 240, 225, 48));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark blue", 0, 0, 139));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark brown", 101, 67, 33));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark byzantium", 93, 57, 84));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Dark candy apple red", 164, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark cerulean", 8, 69, 126));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark champagne", 194, 178, 128));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark chestnut", 152, 105, 96));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark coral", 205, 91, 69));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark cyan", 0, 139, 139));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Dark electric blue", 83, 104, 120));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Almond", 239, 222, 205));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Antique Brass", 205, 149, 117));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Apricot", 253, 217, 181));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Aquamarine", 120, 219, 226));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Asparagus", 135, 169, 107));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Atomic Tangerine", 255, 164, 116));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Banana Mania", 250, 231, 181));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Beaver", 159, 129, 112));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Bittersweet", 253, 124, 110));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Black", 0, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blizzard Blue", 172, 229, 238));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue", 31, 117, 254));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue Bell", 162, 162, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue Gray", 102, 153, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue Green", 13, 152, 186));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blue Violet", 115, 102, 189));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Blush", 222, 93, 131));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brick Red", 203, 65, 84));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Brown", 180, 103, 77));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Burnt Orange", 255, 127, 73));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Burnt Sienna", 234, 126, 93));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cadet Blue", 176, 183, 198));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Canary", 255, 255, 153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Caribbean Green", 28, 211, 162));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Carnation Pink", 255, 170, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cerise", 221, 68, 146));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cerulean", 29, 172, 214));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Chestnut", 188, 93, 88));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Copper", 221, 148, 117));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cornflower", 154, 206, 235));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Cotton Candy", 255, 188, 217));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dandelion", 253, 219, 109));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Denim", 43, 108, 196));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Desert Sand", 239, 205, 184));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Eggplant", 110, 81, 96));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric Lime", 206, 255, 29));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fern", 113, 188, 120));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Forest Green", 109, 174, 129));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fuchsia", 195, 100, 197));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fuzzy Wuzzy", 204, 102, 102));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Gold", 231, 198, 151));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Goldenrod", 252, 217, 117));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Granny Smith Apple", 168, 228,
				160));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Gray", 149, 145, 140));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Green", 28, 172, 120));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Green Blue", 17, 100, 180));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Green Yellow", 240, 232, 145));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Hot Magenta", 255, 29, 206));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Inchworm", 178, 236, 93));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Indigo", 93, 118, 203));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Jazzberry Jam", 202, 55, 103));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Jungle Green", 59, 176, 143));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Laser Lemon", 254, 254, 34));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender", 252, 180, 213));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lemon Yellow", 255, 244, 79));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Macaroni and Cheese", 255, 189,
				136));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Magenta", 246, 100, 175));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Magic Mint", 170, 240, 209));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mahogany", 205, 74, 76));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Maize", 237, 209, 156));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Manatee", 151, 154, 170));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mango Tango", 255, 130, 67));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Maroon", 200, 56, 90));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mauvelous", 239, 152, 170));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Melon", 253, 188, 180));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Midnight Blue", 26, 72, 118));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mountain Meadow", 48, 186, 143));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mulberry", 197, 75, 140));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Navy Blue", 25, 116, 210));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Neon Carrot", 255, 163, 67));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Olive Green", 186, 184, 108));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orange", 255, 117, 56));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orange Red", 255, 43, 43));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orange Yellow", 248, 213, 104));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orchid", 230, 168, 215));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Outer Space", 65, 74, 76));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Outrageous Orange", 255, 110, 74));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pacific Blue", 28, 169, 201));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Peach", 255, 207, 171));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Periwinkle", 197, 208, 230));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Piggy Pink", 253, 221, 230));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pine Green", 21, 128, 120));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pink Flamingo", 252, 116, 253));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pink Sherbert", 247, 143, 167));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Plum", 142, 69, 133));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Purple Heart", 116, 66, 200));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Purple Mountain's Majesty", 157,
				129, 186));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Purple Pizzazz", 255, 29, 206));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Radical Red", 255, 73, 108));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Raw Sienna", 214, 138, 89));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Raw Umber", 113, 75, 35));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Razzle Dazzle Rose", 255, 72, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Razzmatazz", 227, 37, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Red", 238, 32, 77));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Red Orange", 255, 83, 73));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Red Violet", 192, 68, 143));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Robin Egg Blue", 31, 206, 203));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Royal Purple", 120, 81, 169));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Salmon", 255, 155, 170));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Scarlet", 252, 40, 71));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Screamin' Green", 118, 255, 122));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sea Green", 159, 226, 191));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sepia", 165, 105, 79));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Shadow", 138, 121, 93));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Shamrock", 69, 206, 162));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Shocking Pink", 251, 126, 253));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Silver", 205, 197, 194));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sky Blue", 128, 218, 235));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Spring Green", 236, 234, 190));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sunglow", 255, 207, 72));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sunset Orange", 253, 94, 83));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tan", 250, 167, 108));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Teal Blue", 24, 167, 181));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Thistle", 235, 199, 223));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tickle Me Pink", 252, 137, 172));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Timberwolf", 219, 215, 210));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tropical Rain Forest", 23, 128,
				109));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tumbleweed", 222, 170, 136));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Turquoise Blue", 119, 221, 231));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Unmellow Yellow", 255, 255, 102));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Violet (Purple)", 146, 110, 174));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Violet Blue", 50, 74, 178));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Violet Red", 247, 83, 148));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vivid Tangerine", 255, 160, 137));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vivid Violet", 143, 80, 157));
		LIST_OF_RGB_COLOURS.add(new RgbColor("White", 255, 255, 255));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Wild Blue Yonder", 162, 173, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Wild Strawberry", 255, 67, 164));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Wild Watermelon", 252, 108, 133));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Wisteria", 205, 164, 222));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Yellow", 252, 232, 131));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Yellow Green", 197, 227, 132));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Yellow Orange", 255, 174, 66));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark goldenrod", 184, 134, 11));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark green", 1, 50, 32));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark jungle green", 26, 36, 33));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark khaki", 189, 183, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark lava", 72, 60, 50));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark lavender", 115, 79, 150));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark magenta", 139, 0, 139));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark midnight blue", 0, 51, 102));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark olive green", 85, 107, 47));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark orange", 255, 140, 0));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Dark pastel blue", 119, 158, 203));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark pastel green", 3, 192, 60));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark pastel purple", 150, 111,
				214));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark pastel red", 194, 59, 34));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark pink", 231, 84, 128));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark powder blue", 0, 51, 153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark raspberry", 135, 38, 87));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark red", 139, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark salmon", 233, 150, 122));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark scarlet", 86, 3, 25));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark sienna", 60, 20, 20));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark slate gray", 47, 79, 79));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark spring green", 23, 114, 69));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark tan", 145, 129, 81));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark tangerine", 255, 168, 18));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark taupe", 72, 60, 50));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark terra cotta", 204, 78, 92));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark turquoise", 0, 206, 209));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dark violet", 148, 0, 211));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dartmouth green", 13, 128, 15));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Davy's grey", 85, 85, 85));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep aqua", 0, 183, 235));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep carmine", 169, 32, 62));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep carmine pink", 239, 48, 56));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Deep carrot orange", 233, 105, 44));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep cerise", 218, 50, 135));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep champagne", 250, 214, 165));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep chestnut", 185, 78, 72));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep fuchsia", 193, 84, 193));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep jungle green", 0, 75, 73));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep lilac", 153, 85, 187));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep magenta", 204, 0, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep peach", 255, 203, 164));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep pink", 255, 20, 147));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep saffron", 255, 153, 51));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Deep sky blue", 0, 191, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Denim", 21, 96, 189));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Desert", 193, 154, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Desert sand", 237, 201, 175));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dim gray", 105, 105, 105));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dodger blue", 30, 144, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dogwood Rose", 215, 24, 104));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Dollar bill", 133, 187, 101));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Drab", 150, 113, 23));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Duke blue", 0, 0, 156));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Earth yellow", 225, 169, 95));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ecru", 194, 178, 128));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Eggplant", 97, 64, 81));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Eggshell", 240, 234, 214));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Egyptian blue", 16, 52, 166));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric blue", 125, 249, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric crimson", 255, 0, 63));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric cyan", 0, 255, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric green", 0, 255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric indigo", 111, 0, 255));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Electric lavender", 244, 187, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric lime", 204, 255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric purple", 191, 0, 255));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Electric ultramarine", 63, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Electric violet", 143, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Emerald", 80, 200, 120));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Eton blue", 150, 200, 162));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fallow", 193, 154, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Falu red", 128, 24, 24));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fandango", 181, 51, 137));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fashion fuchsia", 244, 0, 161));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fawn", 229, 170, 112));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Feldgrau", 77, 93, 83));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fern green", 79, 121, 66));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ferrari Red", 255, 28, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Field drab", 108, 84, 30));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Firebrick", 178, 34, 34));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fire engine red", 206, 22, 32));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Flame", 226, 88, 34));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Flamingo pink", 252, 142, 172));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Flavescent", 247, 233, 142));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Flax", 238, 220, 130));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Folly", 255, 0, 79));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Forest green (traditional)", 1,
				68, 33));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Forest green (web)", 34, 139, 34));
		LIST_OF_RGB_COLOURS.add(new RgbColor("French beige", 166, 123, 91));
		LIST_OF_RGB_COLOURS.add(new RgbColor("French rose", 246, 74, 138));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fuchsia", 255, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fuchsia pink", 255, 119, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Fulvous", 220, 132, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Gamboge", 228, 155, 15));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ghost white", 248, 248, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Glaucous", 96, 130, 182));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Gold (metallic)", 212, 175, 55));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Gold (web) (Golden)", 255, 215, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Golden brown", 153, 101, 21));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Golden poppy", 252, 194, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Golden yellow", 255, 223, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Goldenrod", 218, 165, 32));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Granny Smith Apple", 168, 228,
				160));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Gray", 128, 128, 128));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Gray-asparagus", 70, 89, 69));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Green (color wheel) (X11 green)",
				0, 255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Green (HTML/CSS green)", 0, 128,
				0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Green (pigment)", 0, 165, 80));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Green (RYB)", 102, 176, 50));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Green-yellow", 173, 255, 47));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Grullo", 169, 154, 134));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Guppie green", 0, 255, 127));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Halaya ube", 102, 56, 84));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Han blue", 68, 108, 207));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Han purple", 82, 24, 250));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Hansa yellow", 233, 214, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Harlequin", 63, 255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Harvard crimson", 201, 0, 22));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Hazel", 218, 145, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Heliotrope", 223, 115, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Hollywood cerise", 244, 0, 161));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Honeydew", 240, 255, 240));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Hooker's green", 114, 102, 49));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Hot magenta", 255, 29, 206));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Hot pink", 255, 105, 180));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Hunter green", 53, 94, 59));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Iceberg", 113, 166, 210));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Icterine", 252, 247, 94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("India green", 19, 136, 8));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Indian yellow", 227, 168, 87));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Indigo (dye)", 0, 65, 106));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Indigo (web)", 75, 0, 130));
		LIST_OF_RGB_COLOURS.add(new RgbColor("International Klein Blue", 0, 47,
				167));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("International orange", 255, 79, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Iris", 90, 79, 207));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Isabelline", 244, 240, 236));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Islamic green", 0, 144, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ivory", 255, 255, 240));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Jade", 0, 168, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Jasper", 215, 59, 62));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Jazzberry jam", 165, 11, 94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Jonquil", 250, 218, 94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("June bud", 189, 218, 87));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Jungle green", 41, 171, 135));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Kelly green", 76, 187, 23));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Khaki (HTML/CSS) (Khaki)", 195,
				176, 145));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Khaki (X11) (Light khaki)", 240,
				230, 140));
		LIST_OF_RGB_COLOURS.add(new RgbColor("La Salle Green", 8, 120, 48));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Languid lavender", 214, 202, 221));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lapis lazuli", 46, 0, 140));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lava", 207, 16, 32));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Lavender (floral)", 181, 126, 220));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender (web)", 230, 230, 250));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender blue", 204, 204, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender blush", 255, 240, 245));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender gray", 196, 195, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender indigo", 148, 87, 235));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Lavender magenta", 238, 130, 238));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender mist", 230, 230, 250));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender pink", 251, 174, 210));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender purple", 150, 123, 182));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lavender rose", 251, 160, 227));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lawn green", 124, 252, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lemon", 255, 247, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lemon chiffon", 255, 250, 205));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light apricot", 253, 213, 177));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light blue", 173, 216, 230));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light brown", 181, 101, 29));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Light carmine pink", 230, 103, 97));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light coral", 240, 128, 128));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light cornflower blue", 154, 206,
				236));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light cyan", 224, 255, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light fuchsia pink", 249, 132,
				229));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light gray", 211, 211, 211));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light khaki", 240, 230, 140));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light mauve", 220, 208, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light pastel purple", 177, 156,
				217));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light pink", 255, 182, 193));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light sea green", 32, 178, 170));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light salmon", 255, 160, 122));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Light salmon pink", 255, 153, 153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light sky blue", 135, 206, 250));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Light slate gray", 119, 136, 153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light taupe", 179, 139, 109));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light Thulian pink", 230, 143,
				172));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Light yellow", 255, 255, 224));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lilac", 200, 162, 200));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Lime (color wheel)", 191, 255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lime (web) (X11 green)", 0, 255,
				0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lime green", 50, 205, 50));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Linen", 250, 240, 230));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Liver", 83, 75, 79));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Lust", 230, 32, 32));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Magenta", 255, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Magenta (dye)", 202, 21, 123));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Magenta (process)", 255, 0, 144));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Magic mint", 170, 240, 209));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Magnolia", 248, 244, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mahogany", 192, 64, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Maize", 251, 236, 94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Majorelle Blue", 96, 80, 220));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Malachite", 11, 218, 81));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Maroon (HTML/CSS)", 128, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Maroon (X11)", 176, 48, 96));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mauve", 224, 176, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mauve taupe", 145, 95, 109));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Maya blue", 115, 194, 251));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Meat brown", 229, 183, 59));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Medium aquamarine", 102, 205, 170));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Medium blue", 0, 0, 205));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Medium candy apple red", 226, 6,
				44));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Medium carmine", 175, 64, 53));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Medium champagne", 243, 229, 171));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Medium electric blue", 3, 80, 150));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Medium jungle green", 28, 53, 45));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Medium lavender magenta", 204,
				153, 204));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Medium Persian blue", 0, 103, 165));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Medium purple", 147, 112, 219));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Medium red-violet", 187, 51, 133));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Medium sea green", 60, 179, 113));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Medium spring bud", 201, 220, 137));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Medium spring green", 0, 250, 154));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Medium taupe", 103, 76, 71));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Medium turquoise", 72, 209, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Midnight blue", 25, 25, 112));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Midnight green (eagle green)", 0,
				73, 83));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mikado yellow", 255, 196, 12));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mint green", 152, 255, 152));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Misty rose", 255, 228, 225));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Moccasin", 250, 235, 215));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mode beige", 150, 113, 23));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Moonstone blue", 115, 169, 194));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mordant red 19", 174, 12, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Moss green", 173, 223, 173));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Mountbatten pink", 153, 122, 141));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mulberry", 197, 75, 140));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Mustard", 255, 219, 88));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Myrtle", 33, 66, 30));
		LIST_OF_RGB_COLOURS.add(new RgbColor("MSU Green", 0, 102, 51));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Nadeshiko pink", 246, 173, 198));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Napier Green", 42, 128, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Naples yellow", 250, 218, 94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Navajo white", 255, 222, 173));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Navy blue", 0, 0, 128));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Neon fuchsia", 254, 65, 100));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Non-photo blue", 164, 221, 237));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ochre", 204, 119, 34));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Office green", 0, 128, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Old Gold", 207, 181, 59));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Old Lace", 253, 245, 230));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Old lavender", 121, 104, 120));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Old mauve", 103, 49, 71));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Old rose", 192, 128, 129));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Olive", 128, 128, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor(
				"Olive Drab (web) (Olive Drab #3)", 107, 142, 35));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Olive Drab #7", 60, 52, 31));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Olivine", 154, 185, 115));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Onyx", 15, 15, 15));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Opera mauve", 183, 132, 167));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orange (color wheel)", 255, 127,
				0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orange (RYB)", 251, 153, 2));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Orange (web color)", 255, 165, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orange peel", 255, 159, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orange-red", 255, 69, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Orchid", 218, 112, 214));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Oxford Blue", 0, 33, 71));
		LIST_OF_RGB_COLOURS.add(new RgbColor("OU Crimson Red", 153, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale amaranth pink", 221, 190,
				195));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale blue", 175, 238, 238));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale brown", 152, 118, 84));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale carmine", 175, 64, 53));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale cerulean", 155, 196, 226));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale chestnut", 221, 173, 175));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale copper", 218, 138, 103));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale cornflower blue", 171, 205,
				239));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale gold", 230, 190, 138));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale magenta", 249, 132, 229));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale pink", 250, 218, 221));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale red-violet", 219, 112, 147));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale robin egg blue", 150, 222,
				209));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale silver", 201, 192, 187));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale spring bud", 236, 235, 189));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pale taupe", 188, 152, 126));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Palatinate blue", 39, 59, 226));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Palatinate purple", 104, 40, 96));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pansy purple", 120, 24, 74));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Papaya whip", 255, 239, 213));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Paris Green", 80, 200, 120));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel blue", 174, 198, 207));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel brown", 130, 105, 83));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel gray", 207, 207, 196));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel green", 119, 221, 119));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel magenta", 244, 154, 194));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel orange", 255, 179, 71));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel pink", 255, 209, 220));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel purple", 179, 158, 181));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel red", 255, 105, 97));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel violet", 203, 153, 201));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pastel yellow", 253, 253, 150));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Payne's grey", 64, 64, 72));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Peach", 255, 229, 180));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Peach-orange", 255, 204, 153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Peach puff", 255, 218, 185));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Peach-yellow", 250, 223, 173));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pear", 209, 226, 49));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pearl", 240, 234, 214));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Peridot", 230, 226, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Periwinkle", 204, 204, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Persian blue", 28, 57, 187));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Persian green", 0, 166, 147));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Persian indigo", 50, 18, 122));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Persian orange", 217, 144, 88));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Persian red", 204, 51, 51));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Persian pink", 247, 127, 190));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Persian rose", 254, 40, 162));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Persimmon", 236, 88, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Phthalo blue", 0, 15, 137));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Phthalo green", 18, 53, 36));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Piggy pink", 253, 221, 230));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pine green", 1, 121, 111));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pink", 255, 192, 203));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pink-orange", 255, 153, 102));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pink pearl", 231, 172, 207));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pink Sherbert", 247, 143, 167));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pistachio", 147, 197, 114));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Platinum", 229, 228, 226));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Plum (web)", 204, 153, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Portland Orange", 255, 90, 54));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Powder blue (web)", 176, 224, 230));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Princeton orange", 255, 143, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Prussian blue", 0, 49, 83));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Psychedelic purple", 221, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Puce", 204, 136, 153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Pumpkin", 255, 117, 24));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Purple (HTML/CSS)", 127, 0, 127));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Purple (X11)", 160, 92, 240));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Purple Heart", 105, 53, 156));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Purple mountain majesty", 150,
				120, 182));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Purple taupe", 80, 64, 77));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Radical Red", 255, 53, 94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Raspberry", 227, 11, 92));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Raspberry glace", 145, 95, 109));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Raspberry pink", 226, 80, 155));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Raspberry rose", 179, 68, 108));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Raw umber", 130, 102, 68));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Razzle dazzle rose", 255, 51, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Razzmatazz", 227, 37, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Red", 255, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Red (pigment)", 237, 28, 36));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Red (RYB)", 254, 39, 18));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Red-brown", 165, 42, 42));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Red-violet", 199, 21, 133));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Redwood", 171, 78, 82));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rich black", 0, 64, 64));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rich brilliant lavender", 241,
				167, 254));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rich carmine", 215, 0, 64));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Rich electric blue", 8, 146, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rich lavender", 170, 97, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rich maroon", 176, 48, 96));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rifle green", 65, 72, 51));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Robin egg blue", 0, 204, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rose", 255, 0, 127));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rose ebony", 103, 76, 71));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rose gold", 183, 110, 121));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rose madder", 227, 38, 54));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rose pink", 255, 102, 204));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rose quartz", 170, 152, 169));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rose taupe", 144, 93, 93));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rose vale", 171, 78, 82));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rosewood", 101, 0, 11));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rosso corsa", 212, 0, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rosy brown", 188, 143, 143));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Royal azure", 0, 56, 168));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Royal blue (traditional)", 0, 35,
				102));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Royal blue (web)", 65, 105, 225));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Royal fuchsia", 202, 44, 146));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Royal purple", 107, 63, 160));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ruby", 224, 17, 95));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ruddy", 255, 0, 40));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ruddy brown", 187, 101, 40));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ruddy pink", 225, 142, 150));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rufous", 168, 28, 7));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Russet", 128, 70, 27));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Rust", 183, 65, 14));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sacramento State green", 0, 86,
				63));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Saddle brown", 139, 69, 19));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Safety orange (blaze orange)",
				255, 103, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Saffron", 244, 196, 48));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("St. Patrick's blue", 35, 41, 122));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Salmon", 255, 140, 105));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Salmon pink", 255, 145, 164));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sand", 194, 178, 128));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sand dune", 150, 113, 23));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sandstorm", 236, 213, 64));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sandy brown", 244, 164, 96));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sandy taupe", 150, 113, 23));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sangria", 146, 0, 10));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sap green", 80, 125, 42));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sapphire", 8, 37, 103));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Satin sheen gold", 203, 161, 53));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Scarlet", 255, 32, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("School bus yellow", 255, 216, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sea green", 46, 139, 87));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Seal brown", 50, 20, 20));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Seashell", 255, 245, 238));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Selective yellow", 255, 186, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sepia", 112, 66, 20));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Shamrock green", 0, 158, 96));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Shocking pink", 252, 15, 192));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sienna", 136, 45, 23));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Silver", 192, 192, 192));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sinopia", 203, 65, 11));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Skobeloff", 0, 122, 116));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sky blue", 135, 206, 235));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sky magenta", 207, 113, 175));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Slate gray", 112, 128, 144));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Smalt (Dark powder blue)", 0, 51,
				153));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Smokey topaz", 147, 65, 8));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Smoky black", 16, 12, 8));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Snow", 255, 250, 250));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Spiro Disco Ball", 15, 192, 252));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Splashed white", 254, 253, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Spring bud", 167, 252, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Spring green", 0, 255, 127));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Steel blue", 70, 130, 180));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Stil de grain yellow", 250, 218,
				94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Straw", 228, 117, 111));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sunglow", 255, 204, 51));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Sunset", 250, 214, 165));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tan", 210, 180, 140));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tangelo", 249, 77, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tangerine", 242, 133, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tangerine yellow", 255, 204, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Taupe", 72, 60, 50));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Taupe gray", 139, 133, 137));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tea green", 208, 240, 192));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Tea rose (orange)", 248, 131, 121));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tea rose (rose)", 244, 194, 194));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Teal", 0, 128, 128));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Teal blue", 54, 117, 136));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tawny", 205, 87, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Terra cotta", 226, 114, 91));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Thistle", 216, 191, 216));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Thulian pink", 222, 111, 161));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tickle Me Pink", 252, 137, 172));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tiffany Blue", 10, 186, 181));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tiger's eye", 224, 141, 60));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Timberwolf", 219, 215, 210));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Titanium yellow", 238, 230, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tomato", 255, 99, 71));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Torch red", 253, 14, 53));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Tropical rain forest", 0, 117, 94));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tumbleweed", 222, 170, 136));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Turkish rose", 181, 114, 129));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Turquoise", 48, 213, 200));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Turquoise blue", 0, 255, 239));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tuscan red", 130, 53, 53));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Twilight lavender", 138, 73, 107));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Tyrian purple", 102, 2, 60));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ube", 136, 120, 195));
		LIST_OF_RGB_COLOURS.add(new RgbColor("UFO Green", 60, 208, 112));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ultramarine", 18, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ultramarine blue", 65, 102, 245));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Ultra pink", 255, 111, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Umber", 99, 81, 71));
		LIST_OF_RGB_COLOURS.add(new RgbColor("United Nations blue", 91, 146,
				229));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Upsdell red", 174, 22, 32));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Urobilin", 225, 173, 33));
		LIST_OF_RGB_COLOURS.add(new RgbColor("UP Forest green", 1, 68, 33));
		LIST_OF_RGB_COLOURS.add(new RgbColor("UP Maroon", 123, 17, 19));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vegas Gold", 197, 179, 88));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Venetian red", 200, 8, 21));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Verdigris", 67, 181, 171));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vermilion", 227, 66, 51));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Violet", 143, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Violet (color wheel)", 127, 0,
				255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Violet (web)", 238, 130, 238));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Violet (RYB)", 134, 1, 175));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Viridian", 64, 130, 109));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vivid auburn", 147, 39, 36));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vivid burgundy", 159, 29, 53));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vivid cerise", 218, 29, 129));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vivid tangerine", 255, 160, 137));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Vivid violet", 159, 0, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Warm black", 0, 66, 66));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Wenge", 100, 84, 82));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Wheat", 245, 222, 179));
		LIST_OF_RGB_COLOURS.add(new RgbColor("White", 255, 255, 255));
		LIST_OF_RGB_COLOURS.add(new RgbColor("White smoke", 245, 245, 245));
		LIST_OF_RGB_COLOURS
				.add(new RgbColor("Wild blue yonder", 162, 173, 208));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Wild Strawberry", 255, 67, 164));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Wild Watermelon", 252, 108, 133));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Wisteria", 201, 160, 220));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Xanadu", 115, 134, 120));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Yale Blue", 15, 77, 146));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Yellow", 255, 255, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Yellow (process)", 255, 239, 0));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Yellow (RYB)", 254, 254, 51));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Yellow-green", 154, 205, 50));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Zaffre", 0, 20, 168));
		LIST_OF_RGB_COLOURS.add(new RgbColor("Zinnwaldite brown", 44, 22, 8));

	}
}
