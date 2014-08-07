package org.jinq.jpa.transform;

import org.jinq.jpa.MetamodelUtil;
import org.jinq.jpa.jpqlquery.JPQLQuery;

public class JPQLGroupingMultiLambdaQueryTransform extends JPQLQueryTransform
{

   JPQLGroupingMultiLambdaQueryTransform(MetamodelUtil metamodel, ClassLoader alternateClassLoader)
   {
      super(metamodel, alternateClassLoader);
   }
   
   public <U, V> JPQLQuery<U> apply(JPQLQuery<V> query, LambdaInfo lambda, LambdaInfo [] groupingLambdas) throws QueryTransformException
   {
      return null;
   }
}