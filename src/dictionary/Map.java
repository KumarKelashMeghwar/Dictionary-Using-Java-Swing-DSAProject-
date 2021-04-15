/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Kelash
 */
public interface Map {
    public Object get(Object key);
    public Object remove(Object key);
    public Object put(Object key,Object value);
    public int size();
}
