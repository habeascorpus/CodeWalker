package codewalker;

import java.io.File;

/**
 * Contains all global configuration settings for program analysis.
 * 
 * @author pschulam
 *
 */
public class ConfigurationSettings {
    
    // Analyze these projects in the workspace.
    public static final String[] projects =
	{
		"apache-ant-1.8.4",
		"apache-cassandra-1.2.0",
		"apache-log4j-1.2.17",
		"apache-maven-3.0.4",
		"batik-1.7",
		"lucene-3.6.2",
		"xalan-j-2.7.1",
		"xerces-2.11.0",
	};
    
    public static final File fileList =
	new File("/home/pschulam/data/habeascorpus/habeascorpus_workspace/filelist.txt");
    
    public static final File tokenDirectory =
	new File("/home/pschulam/data/habeascorpus/habeascorpus_tokens/");
    
    public static final File identifierDirectory =
	new File("/home/pschulam/data/habeascorpus/habeascorpus_identifiers");
}
