/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.library;

import com.grabnotes.library.api.Provider;
import com.tx.library.TXProvider;

public class ListBooks {
	public static void main(String args[]) {
		Provider provider = new TXProvider();
		System.out.println(provider.getBookName());
	}

}
