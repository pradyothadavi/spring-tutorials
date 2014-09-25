/**
 * 
 */
package org.prayogshaale.spring_tutorials;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * @author pradyot.ha
 */
@Service ("collectionInjection")
public class CollectionInjection
{
	@Resource (name = "map")
	private Map<String, Object> map;

	@Resource (name = "props")
	private Properties props;

	@Resource (name = "set")
	private Set set;

	@Resource (name = "list")
	private List list;

	/**
	 * @return the map
	 */
	public Map<String, Object> getMap()
	{
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, Object> map)
	{
		this.map = map;
	}

	/**
	 * @return the props
	 */
	public Properties getProps()
	{
		return props;
	}

	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props)
	{
		this.props = props;
	}

	/**
	 * @return the set
	 */
	public Set getSet()
	{
		return set;
	}

	/**
	 * @param set the set to set
	 */
	public void setSet(Set set)
	{
		this.set = set;
	}

	/**
	 * @return the list
	 */
	public List getList()
	{
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List list)
	{
		this.list = list;
	}

	public void displayCollectionInjection()
	{
		System.out.println("Map Contents:");
		for (Entry<String, Object> entry : map.entrySet())
		{
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

		System.out.println("Properties Contents:");
		for (Entry<Object, Object> entry : props.entrySet())
		{
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

		System.out.println("Set Contents:");
		for (Object obj : set)
		{
			System.out.println("Value: " + obj);
		}

		System.out.println("List Contents:");
		for (Object obj : list)
		{
			System.out.println("Value: " + obj);
		}
	}
}
