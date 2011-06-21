import org.apache.commons.cli.*;

public class LocoArch
	{

	/**
	 * @param args
	 */
	public static void main(String[] args)
		{
		defineOptions();

		System.out.print("LocoArch");

		}

	private static void defineOptions()
	{
		Option option1 = new Option("c","config-file",true,"path to the LocoArch configuration file");
		option1.setArgs(1);option1.setArgName("filename");option1.setRequired(true);
		Option option2 = new Option("o","operation",false,"operation: archive, list, restore, restorebyhash, checkintegrity, recover, freespace");
		option2.setRequired(true);

	}
	}
