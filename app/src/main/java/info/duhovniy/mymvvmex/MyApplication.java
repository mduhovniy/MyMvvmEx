package info.duhovniy.mymvvmex;

import android.app.Application;
import android.content.Context;

import info.duhovniy.mymvvmex.model.GitService;
import rx.Scheduler;
import rx.schedulers.Schedulers;


public class MyApplication extends Application {

    private Scheduler defaultScheduler;
    private GitService gitService;

    public static MyApplication get(Context contex) {
        return (MyApplication) contex.getApplicationContext();
    }

    public Scheduler getDefaultScheduler() {
        if(defaultScheduler == null)
            defaultScheduler = Schedulers.io();
        return defaultScheduler;
    }

    public GitService getGitService() {
        if(gitService == null)
            gitService = GitService.Factory.create();
        return gitService;
    }
}
