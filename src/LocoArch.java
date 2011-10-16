import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.cli.*;

public class LocoArch
	{
	public enum enumCommands
	{
	archive,
	list,
	restore,
	checkintegrity,
	recover,
	freespace,
	restorebyhash
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
		{
		Options(args);

		System.out.print("LocoArch");

		}

	private static void Options(String[] args)
		{
		// Process the options and select the program part to run
		if (args.length==0)
			{
			printUsage("Not enough parameters");
			}
		else
			{
			enumCommands command = enumCommands.valueOf(args[0]);

			switch (command) 
			            {
			            case archive: doArchive(); break;
			            case list:
			            case restore:
			            case checkintegrity:
			            case recover:
			            case freespace:
			            case restorebyhash:
			            	printUsage("Command not implemented");break;
			            default:
			            	printUsage("Command not recognised"); break;
			            				
			            }
			
			}
		
		
		}

	private static void doArchive()
		{
		// TODO Auto-generated method stub
		
		}

	public static void printUsage(String string)
		{
		// Print usage information
		Class c=null;
		try {
			c = Class.forName("LocoArch");
			} 
		catch (Exception ex) 
			{
			// This should not happen.
			}
		InputStream s = c.getResourceAsStream("/resource/Usage.txt");
		// do something with it.
		int ch=-1;
		try
			{
			ch = s.read();
			} 
		catch (IOException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		while (ch!=-1)
			{
			System.out.print((char)ch);
			try
				{
				ch = s.read();
				} 
			catch (IOException e)
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}

	private static void defineOptions()
	{
		Option option1 = new Option("c","config-file",true,"path to the LocoArch configuration file");
		option1.setArgs(1);option1.setArgName("filename");option1.setRequired(true);
		Option option2 = new Option("r","redundancy-filename",true,"path to the redundancy file during archiving");
		option2.setArgName("filename");
		Option option3 = new Option("d","archive-date", true, "archivation date during restore");
		option3.setArgName("archivation date");
		


	}
	}
