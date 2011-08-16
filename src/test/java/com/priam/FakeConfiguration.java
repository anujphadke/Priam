package com.priam;

import java.util.Arrays;
import java.util.List;

import com.priam.conf.IConfiguration;

public class FakeConfiguration implements IConfiguration
{

    public String region;
    public String appName;
    public String zone;
    public String instance_id;

    public FakeConfiguration(String region, String appName, String zone, String ins_id)
    {
        this.region = region;
        this.appName = appName;
        this.zone = zone;
        this.instance_id = ins_id;
    }

    @Override
    public void intialize()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public String getYamlLocation()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getBackupLocation()
    {
        // TODO Auto-generated method stub
        return "casstestbackup";
    }

    @Override
    public String getBackupPrefix()
    {
        // TODO Auto-generated method stub
        return "TEST-netflix.platform.S3";
    }

    @Override
    public boolean isCommitLogBackup()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getCommitLogLocation()
    {
        // TODO Auto-generated method stub
        return "cass/commitlog";
    }

    @Override
    public String getDataFileLocation()
    {
        // TODO Auto-generated method stub
        return "cass/data";
    }

    @Override
    public String getCacheLocation()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<String> getRacs()
    {
        return Arrays.asList("az1", "az2", "az3");
    }

    @Override
    public int getJmxPort()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getThriftPort()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getSnitch()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getRac()
    {
        return this.zone;
    }

    @Override
    public String getHostname()
    {
        // TODO Auto-generated method stub
        return instance_id;
    }

    @Override
    public String getInstanceName()
    {
        return instance_id;
    }

    @Override
    public String getHeapSize()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getHeapNewSize()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getBackupHour()
    {
        // TODO Auto-generated method stub
        return 12;
    }

    @Override
    public String getRestoreSnapshot()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isExperimental()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getAppName()
    {
        return appName;
    }

    @Override
    public int getMaxBackupUploadThreads()
    {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public String getDC()
    {
        // TODO Auto-generated method stub
        return this.region;
    }

    @Override
    public int getMaxBackupDownloadThreads()
    {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public String getRestorePrefix()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getBackupCommitLogLocation()
    {
        return "cass/backup/cl/";
    }

    @Override
    public boolean isMultiDC()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getASGName()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public boolean isIncrBackup()
    {
        return true;
    }

    @Override
    public String getHostIP()
    {
        // TODO Auto-generated method stub
        return null;
    }

}