package uk.ac.ebi.age.ui.client.util;

import java.util.AbstractList;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ListOnJsArray<E extends JavaScriptObject> extends AbstractList<E>
{
 private JsArray<? extends E> array;
 
 public ListOnJsArray( JsArray<? extends E> arr )
 {
  array = arr;
 }

 @Override
 public E get(int index)
 {
  return array.get(index);
 }

 @Override
 public int size()
 {
  return array.length();
 }

}
