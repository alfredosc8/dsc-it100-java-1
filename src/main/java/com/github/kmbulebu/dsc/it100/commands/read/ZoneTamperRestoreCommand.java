
package com.github.kmbulebu.dsc.it100.commands.read;

import com.github.kmbulebu.dsc.it100.commands.ICommandHelp;

public class ZoneTamperRestoreCommand extends BasePartitionZoneCommand implements ICommandHelp {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7725456176619204481L;
	public static final String CODE = "604";

	public String getDescription() {
		return "This command indicates that a zone tamper condition (and associated partition) has been restored.";
	}

	@Override
	public String toString() {
		return "ZoneTamperRestoreCommand [toString()=" + super.toString() + "]";
	}
	
}
