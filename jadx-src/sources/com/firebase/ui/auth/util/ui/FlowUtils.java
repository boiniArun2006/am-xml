package com.firebase.ui.auth.util.ui;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.view.ComponentActivity;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class FlowUtils {
    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    private static void startIntentSenderForResult(HelperActivityBase helperActivityBase, PendingIntent pendingIntent, int i2) {
        HelperActivityBase helperActivityBase2;
        try {
            helperActivityBase2 = helperActivityBase;
            try {
                helperActivityBase2.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                helperActivityBase2.finish(0, IdpResponse.getErrorIntent(e));
            }
        } catch (IntentSender.SendIntentException e3) {
            e = e3;
            helperActivityBase2 = helperActivityBase;
        }
    }

    public static boolean unhandled(@NonNull HelperActivityBase helperActivityBase, @Nullable Exception exc) {
        if (exc instanceof IntentRequiredException) {
            IntentRequiredException intentRequiredException = (IntentRequiredException) exc;
            safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(helperActivityBase, intentRequiredException.getIntent(), intentRequiredException.getRequestCode());
            return false;
        }
        if (!(exc instanceof PendingIntentRequiredException)) {
            return true;
        }
        PendingIntentRequiredException pendingIntentRequiredException = (PendingIntentRequiredException) exc;
        startIntentSenderForResult(helperActivityBase, pendingIntentRequiredException.getPendingIntent(), pendingIntentRequiredException.getRequestCode());
        return false;
    }

    private static void startIntentSenderForResult(FragmentBase fragmentBase, PendingIntent pendingIntent, int i2) {
        FragmentBase fragmentBase2;
        try {
            fragmentBase2 = fragmentBase;
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            fragmentBase2 = fragmentBase;
        }
        try {
            fragmentBase2.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e3) {
            e = e3;
            ((HelperActivityBase) fragmentBase2.requireActivity()).finish(0, IdpResponse.getErrorIntent(e));
        }
    }

    public static boolean unhandled(@NonNull FragmentBase fragmentBase, @Nullable Exception exc) {
        if (exc instanceof IntentRequiredException) {
            IntentRequiredException intentRequiredException = (IntentRequiredException) exc;
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(fragmentBase, intentRequiredException.getIntent(), intentRequiredException.getRequestCode());
            return false;
        }
        if (!(exc instanceof PendingIntentRequiredException)) {
            return true;
        }
        PendingIntentRequiredException pendingIntentRequiredException = (PendingIntentRequiredException) exc;
        startIntentSenderForResult(fragmentBase, pendingIntentRequiredException.getPendingIntent(), pendingIntentRequiredException.getRequestCode());
        return false;
    }
}
