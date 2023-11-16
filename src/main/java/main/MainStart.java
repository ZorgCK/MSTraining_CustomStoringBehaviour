package main;

import customization.CustomCompanyStorer;
import customization.CustomEagerStorer;
import one.microstream.storage.embedded.types.EmbeddedStorage;


public class MainStart
{
	public static void main(String[] args)
	{
		EmbeddedStorage.Foundation().onConnectionFoundation(cf ->
		{
			cf
			.setFieldEvaluatorPersistable(new CustomCompanyStorer())
			.setReferenceFieldEagerEvaluator(new CustomEagerStorer());
		}).start();
	}
}
