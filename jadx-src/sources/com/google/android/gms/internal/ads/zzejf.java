package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzejf extends zzbxk {

    @VisibleForTesting
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdxz zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzeiu zze;
    private String zzf;
    private String zzg;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.f63168h);
        p0.startActivity(p1);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.f63168h);
        p0.startActivity(p1);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals("android.permission.POST_NOTIFICATIONS")) {
                zzejh zzejhVar = (zzejh) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzejhVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzejhVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i2] == 0) {
                    map.put("dialog_action", "confirm");
                    zzt();
                    zzu(activityZza, zzmVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarZzb != null) {
                        zzmVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    public static void zzd(Context context, zzdxz zzdxzVar, zzeiu zzeiuVar, String str, String str2) {
        zzk(context, zzdxzVar, zzeiuVar, str, str2, new HashMap());
    }

    @VisibleForTesting
    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzgog.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzgog.zza(context, 0, intent, 201326592);
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    @Nullable
    private final String zzz() {
        zzeim zzeimVar = (zzeim) this.zza.get(this.zzf);
        return zzeimVar == null ? "" : zzeimVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(context);
                HashMap map = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zZzs ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith(g.f62375e)));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzeiu.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e2) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e2.toString());
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) throws Throwable {
                zzeiu.zzf(zzuVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", map);
        zzs(activity, zzmVar);
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzo(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", map);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, com.google.android.gms.ads.internal.zzt.zzf().zzi(activity));
        zzt();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzq(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    @VisibleForTesting
    public zzejf(Context context, zzeiu zzeiuVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdxz zzdxzVar) {
        this.zzb = context;
        this.zzc = zzdxzVar;
        this.zzd = zzuVar;
        this.zze = zzeiuVar;
    }

    public static void zzk(Context context, zzdxz zzdxzVar, zzeiu zzeiuVar, String str, String str2, Map map) {
        String str3;
        String strZzg;
        if (true != com.google.android.gms.ads.internal.zzt.zzh().zzs(context)) {
            str3 = "offline";
        } else {
            str3 = CustomTabsCallback.ONLINE_EXTRAS_KEY;
        }
        if (zzdxzVar != null) {
            zzdxy zzdxyVarZza = zzdxzVar.zza();
            zzdxyVarZza.zzc("gqi", str);
            zzdxyVarZza.zzc(FileUploadManager.f61572j, str2);
            zzdxyVarZza.zzc("device_connectivity", str3);
            zzdxyVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdxyVarZza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            strZzg = zzdxyVarZza.zzg();
        } else {
            strZzg = "";
        }
        zzeiuVar.zze(new zzeiw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), str, strZzg, 2));
    }

    private final void zzs(final Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!NotificationManagerCompat.nr(activity).n()) {
            if (Build.VERSION.SDK_INT < 33) {
                com.google.android.gms.ads.internal.zzt.zzc();
                AlertDialog.Builder builderZzP = com.google.android.gms.ads.internal.util.zzs.zzP(activity);
                builderZzP.setTitle(zzx(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeja
                    @Override // android.content.DialogInterface.OnClickListener
                    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                        this.zza.zzo(activity, zzmVar, dialogInterface, i2);
                    }
                }).setNegativeButton(zzx(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzejb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                        this.zza.zzp(zzmVar, dialogInterface, i2);
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzejc
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                        this.zza.zzq(zzmVar, dialogInterface);
                    }
                });
                builderZzP.create().show();
                zzw(this.zzf, "rtsdi", zzgui.zza());
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzw(this.zzf, "asnpdi", zzgui.zza());
            return;
        }
        zzt();
        zzu(activity, zzmVar);
    }

    private final void zzt() {
        boolean zZzg;
        boolean zZze;
        String strZzb;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zzb;
            com.google.android.gms.ads.internal.util.zzbo zzboVarZzE = com.google.android.gms.ads.internal.util.zzs.zzE(context);
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
            String str = this.zzg;
            String str2 = this.zzf;
            zzeim zzeimVar = (zzeim) this.zza.get(str2);
            if (zzeimVar == null) {
                strZzb = "";
            } else {
                strZzb = zzeimVar.zzb();
            }
            zZzg = zzboVarZzE.zzg(iObjectWrapperWrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, strZzb));
            if (!zZzg) {
                try {
                    zZze = zzboVarZzE.zze(ObjectWrapper.wrap(context), this.zzg, this.zzf);
                } catch (RemoteException e2) {
                    e = e2;
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to schedule offline notification poster.", e);
                    zZze = zZzg;
                }
            } else {
                zZze = true;
            }
        } catch (RemoteException e3) {
            e = e3;
            zZzg = false;
        }
        if (!zZze) {
            this.zze.zzd(this.zzf);
            zzw(this.zzf, "offline_notification_worker_not_scheduled", zzgui.zza());
        }
    }

    private final void zzu(Activity activity, @Nullable com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog alertDialogZzv = zzv(activity, zzmVar);
        alertDialogZzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzeix(this, alertDialogZzv, timer, zzmVar), 3000L);
    }

    private final AlertDialog zzv(Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzP(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzejd
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzy = zzy(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzy == null) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            Drawable drawableZzc = null;
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzy, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzz = zzz();
            if (!TextUtils.isEmpty(strZzz)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzz);
            }
            zzeim zzeimVar = (zzeim) this.zza.get(this.zzf);
            if (zzeimVar != null) {
                drawableZzc = zzeimVar.zzc();
            }
            if (drawableZzc != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZzc);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static String zzx(int i2, String str) {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf != null) {
            try {
                return resourcesZzf.getString(i2);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    @Nullable
    private static XmlResourceParser zzy(int i2) {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            return null;
        }
        try {
            return resourcesZzf.getLayout(i2);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final void zzc(String str, zzdoh zzdohVar) {
        String strZzQ = zzdohVar.zzQ();
        String strZzB = zzdohVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzQ)) {
            if (strZzB == null) {
                strZzQ = "";
            } else {
                strZzQ = strZzB;
            }
        }
        zzbks zzbksVarZzD = zzdohVar.zzD();
        if (zzbksVarZzD != null) {
            try {
                string = zzbksVarZzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbks zzbksVarZzP = zzdohVar.zzP();
        Drawable drawable = null;
        if (zzbksVarZzP != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbksVarZzP.zzb();
                if (iObjectWrapperZzb != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzeij(strZzQ, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzh(IObjectWrapper iObjectWrapper) {
        zzejh zzejhVar = (zzejh) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzejhVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzejhVar.zzb();
        this.zzf = zzejhVar.zzc();
        this.zzg = zzejhVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjM)).booleanValue()) {
            zzw(this.zzf, "dialog_impression", zzgui.zza());
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builderZzP = com.google.android.gms.ads.internal.util.zzs.zzP(activityZza);
            builderZzP.setTitle(zzx(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeje
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                    this.zza.zzl(activityZza, zzmVarZzb, dialogInterface, i2);
                }
            }).setNegativeButton(zzx(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeiy
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                    this.zza.zzm(zzmVarZzb, dialogInterface, i2);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeiz
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzn(zzmVarZzb, dialogInterface);
                }
            });
            builderZzP.create().show();
            return;
        }
        zzs(activityZza, zzmVarZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        String strZzz = zzz();
        com.google.android.gms.ads.internal.zzt.zzf().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (!TextUtils.isEmpty(strZzz)) {
            builder.ck(String.format(zzx(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzz));
        } else {
            builder.ck(zzx(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        }
        builder.xMQ(true).r(pendingIntentZzr2).ty(pendingIntentZzr).iF(context.getApplicationInfo().icon).nY(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjN)).intValue());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjP)).booleanValue() && !str4.isEmpty()) {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(AdMobNetworkBridge.urlConnectionGetInputStream(new URL(str4).openConnection()));
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        } else {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            try {
                builder.S(bitmapDecodeStream).fD(new NotificationCompat.BigPictureStyle().mUb(bitmapDecodeStream).xMQ(null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.t());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e2) {
            map.put("notification_not_shown_reason", e2.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }
}
