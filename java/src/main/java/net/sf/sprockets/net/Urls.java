/*
 * Copyright 2014 pushbit <pushbit@gmail.com>
 * 
 * This file is part of Sprockets.
 * 
 * Sprockets is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Sprockets is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with Sprockets. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.sprockets.net;

/**
 * Utility methods for working with URLs.
 * 
 * @since 2.0.0
 */
public class Urls {
	private Urls() {
	}

	/**
	 * If the URL does not start with {@code http://} or {@code https://}, prepend {@code http://}.
	 */
	public static String addHttp(String url) {
		if (!(url.startsWith("http://") || url.startsWith("https://"))) {
			url = "http://" + url;
		}
		return url;
	}
}
