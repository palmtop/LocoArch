import org.apache.commons.cli.*;

public class LocoArch
	{

	/**
	 * @param args
	 */
	public static void main(String[] args)
		{
		Options();

		System.out.print("LocoArch");

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
