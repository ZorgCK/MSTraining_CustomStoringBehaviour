package customization;

import java.lang.reflect.Field;

import domain.Company;
import one.microstream.persistence.types.PersistenceFieldEvaluator;


public class CustomCompanyStorer implements PersistenceFieldEvaluator
{
	@Override
	public boolean applies(Class<?> entityType, Field field)
	{
		if(entityType == Company.class && field.getType().isArray())
		{
			return false;
		}
		return true;
	}
	
}
