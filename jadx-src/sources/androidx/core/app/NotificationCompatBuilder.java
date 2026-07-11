package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private RemoteViews f36292O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f36293n;
    private RemoteViews nr;
    private final Notification.Builder rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final NotificationCompat.Builder f36294t;
    private RemoteViews xMQ;
    private final List J2 = new ArrayList();
    private final Bundle Uo = new Bundle();

    @RequiresApi
    static class Api21Impl {
        static Notification.Builder O(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder J2(Notification.Builder builder, int i2) {
            return builder.setVisibility(i2);
        }

        static Notification.Builder n(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder nr(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder rl(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder t(Notification.Builder builder, int i2) {
            return builder.setColor(i2);
        }
    }

    @RequiresApi
    static class Api23Impl {
        static Notification.Action.Builder n(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder t(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }

        static Notification.Builder rl(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    @RequiresApi
    static class Api26Impl {
        static Notification.Builder n(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder J2(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder O(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder Uo(Notification.Builder builder, long j2) {
            return builder.setTimeoutAfter(j2);
        }

        static Notification.Builder nr(Notification.Builder builder, int i2) {
            return builder.setGroupAlertBehavior(i2);
        }

        static Notification.Builder rl(Notification.Builder builder, int i2) {
            return builder.setBadgeIconType(i2);
        }

        static Notification.Builder t(Notification.Builder builder, boolean z2) {
            return builder.setColorized(z2);
        }
    }

    @RequiresApi
    static class Api29Impl {
        static Notification.Builder nr(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }

        static Notification.Builder n(Notification.Builder builder, boolean z2) {
            return builder.setAllowSystemGeneratedContextualActions(z2);
        }

        static Notification.Builder rl(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder t(Notification.Action.Builder builder, boolean z2) {
            return builder.setContextual(z2);
        }
    }

    private void KN(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @RequiresApi
    static class Api20Impl {
        static Notification.Builder J2(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder KN(Notification.Builder builder, boolean z2) {
            return builder.setLocalOnly(z2);
        }

        static String O(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder Uo(Notification.Builder builder, boolean z2) {
            return builder.setGroupSummary(z2);
        }

        static Notification.Builder n(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action nr(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder rl(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder t(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Builder xMQ(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    @RequiresApi
    static class Api24Impl {
        static Notification.Builder O(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }

        static Notification.Action.Builder n(Notification.Action.Builder builder, boolean z2) {
            return builder.setAllowGeneratedReplies(z2);
        }

        static Notification.Builder nr(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder rl(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder t(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }
    }

    @RequiresApi
    static class Api28Impl {
        static Notification.Builder n(Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder rl(Notification.Action.Builder builder, int i2) {
            return builder.setSemanticAction(i2);
        }
    }

    @RequiresApi
    static class Api31Impl {
        static Notification.Action.Builder n(Notification.Action.Builder builder, boolean z2) {
            return builder.setAuthenticationRequired(z2);
        }

        static Notification.Builder rl(Notification.Builder builder, int i2) {
            return builder.setForegroundServiceBehavior(i2);
        }
    }

    private static List O(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    private static List Uo(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Person) it.next()).xMQ());
        }
        return arrayList;
    }

    Context J2() {
        return this.f36293n;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder n() {
        return this.rl;
    }

    protected Notification nr() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.rl.build();
        }
        Notification notificationBuild = this.rl.build();
        if (this.KN != 0) {
            if (Api20Impl.O(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.KN == 2) {
                KN(notificationBuild);
            }
            if (Api20Impl.O(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.KN == 1) {
                KN(notificationBuild);
            }
        }
        return notificationBuild;
    }

    public Notification t() {
        Bundle bundleN;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        NotificationCompat.Style style = this.f36294t.Ik;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews remoteViewsMakeContentView = style != null ? style.makeContentView(this) : null;
        Notification notificationNr = nr();
        if (remoteViewsMakeContentView != null) {
            notificationNr.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = this.f36294t.f36265N;
            if (remoteViews != null) {
                notificationNr.contentView = remoteViews;
            }
        }
        if (style != null && (remoteViewsMakeBigContentView = style.makeBigContentView(this)) != null) {
            notificationNr.bigContentView = remoteViewsMakeBigContentView;
        }
        if (style != null && (remoteViewsMakeHeadsUpContentView = this.f36294t.Ik.makeHeadsUpContentView(this)) != null) {
            notificationNr.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (style != null && (bundleN = NotificationCompat.n(notificationNr)) != null) {
            style.addCompatExtras(bundleN);
        }
        return notificationNr;
    }

    NotificationCompatBuilder(NotificationCompat.Builder builder) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Icon iconAYN;
        List listO;
        int i2;
        this.f36294t = builder;
        Context context = builder.f36274n;
        this.f36293n = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.rl = Api26Impl.n(context, builder.wTp);
        } else {
            this.rl = new Notification.Builder(builder.f36274n);
        }
        Notification notification = builder.p5;
        Notification.Builder lights = this.rl.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.xMQ).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z2);
        if ((notification.flags & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z3);
        if ((notification.flags & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z4).setDefaults(notification.defaults).setContentTitle(builder.f36266O).setContentText(builder.J2).setContentInfo(builder.gh).setContentIntent(builder.Uo).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = builder.KN;
        if ((notification.flags & 128) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z5).setNumber(builder.qie).setProgress(builder.XQ, builder.f36267S, builder.WPU);
        Notification.Builder builder2 = this.rl;
        IconCompat iconCompat = builder.mUb;
        if (iconCompat == null) {
            iconAYN = null;
        } else {
            iconAYN = iconCompat.aYN(context);
        }
        Api23Impl.rl(builder2, iconAYN);
        this.rl.setSubText(builder.f36276r).setUsesChronometer(builder.HI).setPriority(builder.az);
        NotificationCompat.Style style = builder.Ik;
        if (style instanceof NotificationCompat.CallStyle) {
            Iterator it = ((NotificationCompat.CallStyle) style).KN().iterator();
            while (it.hasNext()) {
                rl((NotificationCompat.Action) it.next());
            }
        } else {
            Iterator it2 = builder.rl.iterator();
            while (it2.hasNext()) {
                rl((NotificationCompat.Action) it2.next());
            }
        }
        Bundle bundle = builder.E2;
        if (bundle != null) {
            this.Uo.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.nr = builder.f36265N;
        this.f36292O = builder.nHg;
        this.rl.setShowWhen(builder.ty);
        Api20Impl.KN(this.rl, builder.f36273g);
        Api20Impl.J2(this.rl, builder.aYN);
        Api20Impl.xMQ(this.rl, builder.nY);
        Api20Impl.Uo(this.rl, builder.ViF);
        this.KN = builder.jB;
        Api21Impl.rl(this.rl, builder.fD);
        Api21Impl.t(this.rl, builder.f36272e);
        Api21Impl.J2(this.rl, builder.f36270X);
        Api21Impl.nr(this.rl, builder.f36268T);
        Api21Impl.O(this.rl, notification.sound, notification.audioAttributes);
        if (i3 < 28) {
            listO = O(Uo(builder.f36277t), builder.f36264M);
        } else {
            listO = builder.f36264M;
        }
        if (listO != null && !listO.isEmpty()) {
            Iterator it3 = listO.iterator();
            while (it3.hasNext()) {
                Api21Impl.n(this.rl, (String) it3.next());
            }
        }
        this.xMQ = builder.s7N;
        if (builder.nr.size() > 0) {
            Bundle bundle2 = builder.O().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i5 = 0; i5 < builder.nr.size(); i5++) {
                bundle4.putBundle(Integer.toString(i5), NotificationCompatJellybean.n((NotificationCompat.Action) builder.nr.get(i5)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.O().putBundle("android.car.EXTENSIONS", bundle2);
            this.Uo.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = builder.f36263E;
        if (obj != null) {
            Api23Impl.t(this.rl, obj);
        }
        this.rl.setExtras(builder.E2);
        Api24Impl.O(this.rl, builder.f36271Z);
        RemoteViews remoteViews = builder.f36265N;
        if (remoteViews != null) {
            Api24Impl.t(this.rl, remoteViews);
        }
        RemoteViews remoteViews2 = builder.nHg;
        if (remoteViews2 != null) {
            Api24Impl.rl(this.rl, remoteViews2);
        }
        RemoteViews remoteViews3 = builder.s7N;
        if (remoteViews3 != null) {
            Api24Impl.nr(this.rl, remoteViews3);
        }
        if (i7 >= 26) {
            Api26Impl.rl(this.rl, builder.f36278v);
            Api26Impl.O(this.rl, builder.f36275o);
            Api26Impl.J2(this.rl, builder.rV9);
            Api26Impl.Uo(this.rl, builder.Xw);
            Api26Impl.nr(this.rl, builder.jB);
            if (builder.iF) {
                Api26Impl.t(this.rl, builder.te);
            }
            if (!TextUtils.isEmpty(builder.wTp)) {
                this.rl.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it4 = builder.f36277t.iterator();
            while (it4.hasNext()) {
                Api28Impl.n(this.rl, ((Person) it4.next()).mUb());
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            Api29Impl.n(this.rl, builder.P5);
            Api29Impl.rl(this.rl, NotificationCompat.BubbleMetadata.xMQ(builder.M7));
            LocusIdCompat locusIdCompat = builder.bzg;
            if (locusIdCompat != null) {
                Api29Impl.nr(this.rl, locusIdCompat.rl());
            }
        }
        if (i8 >= 31 && (i2 = builder.f36269U) != 0) {
            Api31Impl.rl(this.rl, i2);
        }
        if (builder.eF) {
            if (this.f36294t.ViF) {
                this.KN = 2;
            } else {
                this.KN = 1;
            }
            this.rl.setVibrate(null);
            this.rl.setSound(null);
            int i9 = notification.defaults & (-4);
            notification.defaults = i9;
            this.rl.setDefaults(i9);
            if (i8 >= 26) {
                if (TextUtils.isEmpty(this.f36294t.aYN)) {
                    Api20Impl.J2(this.rl, "silent");
                }
                Api26Impl.nr(this.rl, this.KN);
            }
        }
    }

    private void rl(NotificationCompat.Action action) {
        Icon iconWPU;
        Bundle bundle;
        IconCompat iconCompatNr = action.nr();
        if (iconCompatNr != null) {
            iconWPU = iconCompatNr.WPU();
        } else {
            iconWPU = null;
        }
        Notification.Action.Builder builderN = Api23Impl.n(iconWPU, action.KN(), action.n());
        if (action.O() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInput.rl(action.O())) {
                Api20Impl.t(builderN, remoteInput);
            }
        }
        if (action.t() != null) {
            bundle = new Bundle(action.t());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.rl());
        int i2 = Build.VERSION.SDK_INT;
        Api24Impl.n(builderN, action.rl());
        bundle.putInt("android.support.action.semanticAction", action.J2());
        if (i2 >= 28) {
            Api28Impl.rl(builderN, action.J2());
        }
        if (i2 >= 29) {
            Api29Impl.t(builderN, action.mUb());
        }
        if (i2 >= 31) {
            Api31Impl.n(builderN, action.xMQ());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.Uo());
        Api20Impl.rl(builderN, bundle);
        Api20Impl.n(this.rl, Api20Impl.nr(builderN));
    }
}
