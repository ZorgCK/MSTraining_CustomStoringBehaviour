package customization;

import java.lang.reflect.Field;

import one.microstream.persistence.types.PersistenceEagerStoringFieldEvaluator;


public class CustomEagerStorer implements PersistenceEagerStoringFieldEvaluator
{
	@Override
	public boolean isEagerStoring(Class<?> clazz, Field field)
	{
		return field.isAnnotationPresent(StoreEager.class);
	}
	
}
