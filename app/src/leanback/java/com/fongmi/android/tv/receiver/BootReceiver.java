package com.fongmi.android.tv.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.android.cast.dlna.dmr.DLNARendererService;
import com.fongmi.android.tv.App;
import com.fongmi.android.tv.R;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        DLNARendererService.Companion.startService(App.get(), R.drawable.ic_logo);
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }
}
