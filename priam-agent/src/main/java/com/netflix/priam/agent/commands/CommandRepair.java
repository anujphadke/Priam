package com.netflix.priam.agent.commands;

import com.google.common.collect.Sets;
import com.netflix.priam.IConfiguration;
import com.netflix.priam.agent.process.AgentProcess;
import com.netflix.priam.utils.JMXNodeTool;
import java.util.Arrays;
import java.util.Set;

public class CommandRepair implements AgentProcess
{
    @Override
    public void performCommand(IConfiguration configuration, String[] arguments) throws Exception
    {
        JMXNodeTool     nodeTool = JMXNodeTool.instance(configuration);
        Set<String>     argumentsSet = Sets.newHashSet(Arrays.asList(arguments));
        boolean         sequential = argumentsSet.contains("sequential");
        boolean         localDataCenterOnly = argumentsSet.contains("local-dc-only");
        nodeTool.repair(sequential, localDataCenterOnly);
    }

    @Override
    public String getHelpText()
    {
        return "Calls nodeTool.repair(sequential, localDataCenterOnly). sequential is true if arguments contains \"sequential\". localDataCenterOnly is true if arguments contains \"local-dc-only\"";
    }
}
