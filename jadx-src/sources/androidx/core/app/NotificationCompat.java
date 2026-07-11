package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.app.Person;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import ep.oxM.esLNYym;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class NotificationCompat {

    public static class Action {
        boolean J2;
        private final boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f36248O;
        private final int Uo;
        public PendingIntent gh;
        public CharSequence mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Bundle f36249n;
        private final RemoteInput[] nr;
        private boolean qie;
        private IconCompat rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final RemoteInput[] f36250t;
        public int xMQ;

        public static final class Builder {
            private ArrayList J2;
            private boolean KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final Bundle f36251O;
            private int Uo;
            private boolean mUb;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final IconCompat f36252n;
            private boolean nr;
            private final CharSequence rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final PendingIntent f36253t;
            private boolean xMQ;

            @RequiresApi
            static class Api20Impl {
            }

            @RequiresApi
            static class Api23Impl {
            }

            @RequiresApi
            static class Api24Impl {
            }

            @RequiresApi
            static class Api28Impl {
            }

            @RequiresApi
            static class Api29Impl {
            }

            @RequiresApi
            static class Api31Impl {
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
                this.nr = true;
                this.KN = true;
                this.f36252n = iconCompat;
                this.rl = Builder.KN(charSequence);
                this.f36253t = pendingIntent;
                this.f36251O = bundle;
                this.J2 = remoteInputArr == null ? null : new ArrayList(Arrays.asList(remoteInputArr));
                this.nr = z2;
                this.Uo = i2;
                this.KN = z3;
                this.xMQ = z4;
                this.mUb = z5;
            }

            private void rl() {
                if (this.xMQ && this.f36253t == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public Action n() {
                rl();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<RemoteInput> arrayList3 = this.J2;
                if (arrayList3 != null) {
                    for (RemoteInput remoteInput : arrayList3) {
                        if (remoteInput.mUb()) {
                            arrayList.add(remoteInput);
                        } else {
                            arrayList2.add(remoteInput);
                        }
                    }
                }
                return new Action(this.f36252n, this.rl, this.f36253t, this.f36251O, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]), arrayList.isEmpty() ? null : (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]), this.nr, this.Uo, this.KN, this.xMQ, this.mUb);
            }
        }

        public interface Extender {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f36254n = 1;
            private CharSequence nr;
            private CharSequence rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private CharSequence f36255t;

            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public WearableExtender clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.f36254n = this.f36254n;
                wearableExtender.rl = this.rl;
                wearableExtender.f36255t = this.f36255t;
                wearableExtender.nr = this.nr;
                return wearableExtender;
            }
        }

        public Action(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.gh(null, "", i2) : null, charSequence, pendingIntent);
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public int J2() {
            return this.Uo;
        }

        public CharSequence KN() {
            return this.mUb;
        }

        public RemoteInput[] O() {
            return this.f36250t;
        }

        public boolean Uo() {
            return this.J2;
        }

        public boolean mUb() {
            return this.KN;
        }

        public PendingIntent n() {
            return this.gh;
        }

        public IconCompat nr() {
            int i2;
            if (this.rl == null && (i2 = this.xMQ) != 0) {
                this.rl = IconCompat.gh(null, "", i2);
            }
            return this.rl;
        }

        public boolean rl() {
            return this.f36248O;
        }

        public Bundle t() {
            return this.f36249n;
        }

        public boolean xMQ() {
            return this.qie;
        }

        Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
            this.J2 = true;
            this.rl = iconCompat;
            if (iconCompat != null && iconCompat.ck() == 2) {
                this.xMQ = iconCompat.az();
            }
            this.mUb = Builder.KN(charSequence);
            this.gh = pendingIntent;
            this.f36249n = bundle == null ? new Bundle() : bundle;
            this.f36250t = remoteInputArr;
            this.nr = remoteInputArr2;
            this.f36248O = z2;
            this.Uo = i2;
            this.J2 = z3;
            this.KN = z4;
            this.qie = z5;
        }
    }

    @RequiresApi
    static class Api20Impl {
    }

    @RequiresApi
    static class Api23Impl {
    }

    @RequiresApi
    static class Api24Impl {
    }

    @RequiresApi
    static class Api26Impl {
    }

    @RequiresApi
    static class Api28Impl {
    }

    @RequiresApi
    static class Api29Impl {
    }

    @RequiresApi
    static class Api31Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f36256O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private IconCompat f36257n;
        private CharSequence nr;
        private IconCompat rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f36258t;

        @RequiresApi
        private static class Api23Impl {
            @RequiresApi
            static void n(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @RequiresApi
        private static class Api31Impl {
            @RequiresApi
            static void n(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi
            static void rl(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi
            static void t(Notification.BigPictureStyle bigPictureStyle, boolean z2) {
                bigPictureStyle.showBigPictureWhenCollapsed(z2);
            }
        }

        private static IconCompat KN(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.t((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.Uo((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat gh(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? KN(parcelable) : KN(bundle.getParcelable("android.pictureIcon"));
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public BigPictureStyle mUb(Bitmap bitmap) {
            this.f36257n = bitmap == null ? null : IconCompat.Uo(bitmap);
            return this;
        }

        public BigPictureStyle xMQ(Bitmap bitmap) {
            this.rl = bitmap == null ? null : IconCompat.Uo(bitmap);
            this.f36258t = true;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Context contextJ2;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.n()).setBigContentTitle(this.mBigContentTitle);
            IconCompat iconCompat = this.f36257n;
            Context contextJ22 = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder) {
                        contextJ2 = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).J2();
                    } else {
                        contextJ2 = null;
                    }
                    Api31Impl.n(bigContentTitle, this.f36257n.aYN(contextJ2));
                } else if (iconCompat.ck() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f36257n.qie());
                }
            }
            if (this.f36258t) {
                if (this.rl == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    if (notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder) {
                        contextJ22 = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).J2();
                    }
                    Api23Impl.n(bigContentTitle, this.rl.aYN(contextJ22));
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.t(bigContentTitle, this.f36256O);
                Api31Impl.rl(bigContentTitle, this.nr);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.pictureIcon");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.rl = KN(bundle.getParcelable("android.largeIcon.big"));
                this.f36258t = true;
            }
            this.f36257n = gh(bundle);
            this.f36256O = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }
    }

    public static class BigTextStyle extends Style {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CharSequence f36259n;

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public BigTextStyle KN(CharSequence charSequence) {
            this.f36259n = Builder.KN(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.n()).setBigContentTitle(this.mBigContentTitle).bigText(this.f36259n);
            if (this.mSummaryTextSet) {
                bigTextStyleBigText.setSummaryText(this.mSummaryText);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove("android.bigText");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f36259n = bundle.getCharSequence("android.bigText");
        }
    }

    public static final class BubbleMetadata {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f36260O;
        private String Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private PendingIntent f36261n;
        private int nr;
        private PendingIntent rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private IconCompat f36262t;

        @RequiresApi
        private static class Api29Impl {
            @RequiresApi
            static Notification.BubbleMetadata n(BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.J2() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.O().WPU()).setIntent(bubbleMetadata.J2()).setDeleteIntent(bubbleMetadata.rl()).setAutoExpandBubble(bubbleMetadata.n()).setSuppressNotification(bubbleMetadata.KN());
                if (bubbleMetadata.t() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.t());
                }
                if (bubbleMetadata.nr() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.nr());
                }
                return suppressNotification.build();
            }
        }

        @RequiresApi
        private static class Api30Impl {
            @RequiresApi
            static Notification.BubbleMetadata n(BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = bubbleMetadata.Uo() != null ? new Notification.BubbleMetadata.Builder(bubbleMetadata.Uo()) : new Notification.BubbleMetadata.Builder(bubbleMetadata.J2(), bubbleMetadata.O().WPU());
                builder.setDeleteIntent(bubbleMetadata.rl()).setAutoExpandBubble(bubbleMetadata.n()).setSuppressNotification(bubbleMetadata.KN());
                if (bubbleMetadata.t() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.t());
                }
                if (bubbleMetadata.nr() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.nr());
                }
                return builder.build();
            }
        }

        public static final class Builder {
        }

        public static Notification.BubbleMetadata xMQ(BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return Api30Impl.n(bubbleMetadata);
            }
            if (i2 == 29) {
                return Api29Impl.n(bubbleMetadata);
            }
            return null;
        }

        public PendingIntent J2() {
            return this.f36261n;
        }

        public boolean KN() {
            return (this.J2 & 2) != 0;
        }

        public IconCompat O() {
            return this.f36262t;
        }

        public String Uo() {
            return this.Uo;
        }

        public boolean n() {
            return (this.J2 & 1) != 0;
        }

        public int nr() {
            return this.f36260O;
        }

        public PendingIntent rl() {
            return this.rl;
        }

        public int t() {
            return this.nr;
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        Object f36263E;
        Bundle E2;
        boolean HI;
        Style Ik;
        CharSequence J2;
        PendingIntent KN;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public ArrayList f36264M;
        BubbleMetadata M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        RemoteViews f36265N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        CharSequence f36266O;
        boolean P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f36267S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        Notification f36268T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        int f36269U;
        PendingIntent Uo;
        boolean ViF;
        boolean WPU;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        int f36270X;
        int XQ;
        long Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        CharSequence[] f36271Z;
        String aYN;
        int az;
        LocusIdCompat bzg;
        boolean ck;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f36272e;
        boolean eF;
        String fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f36273g;
        CharSequence gh;
        boolean iF;
        int jB;
        IconCompat mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Context f36274n;
        RemoteViews nHg;
        String nY;
        ArrayList nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        CharSequence f36275o;
        Notification p5;
        int qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f36276r;
        String rV9;
        public ArrayList rl;
        RemoteViews s7N;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ArrayList f36277t;
        boolean te;
        boolean ty;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f36278v;
        String wTp;
        RemoteViews xMQ;

        @RequiresApi
        static class Api21Impl {
        }

        @RequiresApi
        static class Api23Impl {
        }

        @RequiresApi
        static class Api24Impl {
        }

        public Builder(Context context, String str) {
            this.rl = new ArrayList();
            this.f36277t = new ArrayList();
            this.nr = new ArrayList();
            this.ty = true;
            this.f36273g = false;
            this.f36272e = 0;
            this.f36270X = 0;
            this.f36278v = 0;
            this.jB = 0;
            this.f36269U = 0;
            Notification notification = new Notification();
            this.p5 = notification;
            this.f36274n = context;
            this.wTp = str;
            notification.when = System.currentTimeMillis();
            this.p5.audioStreamType = -1;
            this.az = 0;
            this.f36264M = new ArrayList();
            this.P5 = true;
        }

        public Builder aYN(boolean z2) {
            o(2, z2);
            return this;
        }

        protected static CharSequence KN(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void o(int i2, boolean z2) {
            if (z2) {
                Notification notification = this.p5;
                notification.flags = i2 | notification.flags;
            } else {
                Notification notification2 = this.p5;
                notification2.flags = (~i2) & notification2.flags;
            }
        }

        public Builder Ik(int i2) {
            Notification notification = this.p5;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public int J2() {
            return this.az;
        }

        public Builder N(long j2) {
            this.p5.when = j2;
            return this;
        }

        public Bundle O() {
            if (this.E2 == null) {
                this.E2 = new Bundle();
            }
            return this.E2;
        }

        public Builder S(Bitmap bitmap) {
            this.mUb = bitmap == null ? null : IconCompat.Uo(NotificationCompat.rl(this.f36274n, bitmap));
            return this;
        }

        public Builder T(int i2) {
            this.f36270X = i2;
            return this;
        }

        public long Uo() {
            if (this.ty) {
                return this.p5.when;
            }
            return 0L;
        }

        public Builder ViF(boolean z2) {
            o(8, z2);
            return this;
        }

        public Builder WPU(boolean z2) {
            this.f36273g = z2;
            return this;
        }

        public Builder X(boolean z2) {
            this.HI = z2;
            return this;
        }

        public Builder XQ(String str) {
            this.aYN = str;
            return this;
        }

        public Builder Z(int i2) {
            this.f36269U = i2;
            return this;
        }

        public Builder az(boolean z2) {
            this.te = z2;
            this.iF = true;
            return this;
        }

        public Builder e(CharSequence charSequence) {
            this.p5.tickerText = KN(charSequence);
            return this;
        }

        public Builder fD(Style style) {
            if (this.Ik != style) {
                this.Ik = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        public Builder g(int i2, int i3, boolean z2) {
            this.XQ = i2;
            this.f36267S = i3;
            this.WPU = z2;
            return this;
        }

        public Builder gh(String str) {
            this.wTp = str;
            return this;
        }

        public Builder iF(int i2) {
            this.p5.icon = i2;
            return this;
        }

        public Builder mUb(int i2) {
            this.f36278v = i2;
            return this;
        }

        public Builder n(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.rl.add(new Action(i2, charSequence, pendingIntent));
            return this;
        }

        public Builder nY(int i2) {
            this.az = i2;
            return this;
        }

        public int nr() {
            return this.f36272e;
        }

        public Builder qie(int i2) {
            this.f36272e = i2;
            return this;
        }

        public Builder r(PendingIntent pendingIntent) {
            this.p5.deleteIntent = pendingIntent;
            return this;
        }

        public Builder rl(Action action) {
            if (action != null) {
                this.rl.add(action);
            }
            return this;
        }

        public Notification t() {
            return new NotificationCompatBuilder(this).t();
        }

        public Builder te(boolean z2) {
            this.ty = z2;
            return this;
        }

        public Builder ty(PendingIntent pendingIntent) {
            this.Uo = pendingIntent;
            return this;
        }

        public Builder xMQ(boolean z2) {
            o(16, z2);
            return this;
        }

        public Builder E2(CharSequence charSequence) {
            this.f36276r = KN(charSequence);
            return this;
        }

        public Builder HI(CharSequence charSequence) {
            this.J2 = KN(charSequence);
            return this;
        }

        public Builder ck(CharSequence charSequence) {
            this.f36266O = KN(charSequence);
            return this;
        }

        public Builder(Context context) {
            this(context, null);
        }
    }

    public static class CallStyle extends Style {
        private boolean J2;
        private Integer KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private PendingIntent f36279O;
        private Integer Uo;
        private CharSequence mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f36280n;
        private PendingIntent nr;
        private Person rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private PendingIntent f36281t;
        private IconCompat xMQ;

        @RequiresApi
        static class Api20Impl {
        }

        @RequiresApi
        static class Api24Impl {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface CallType {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        @RequiresApi
        static class Api21Impl {
            static Notification.Builder n(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder rl(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @RequiresApi
        static class Api23Impl {
            static Parcelable n(Icon icon) {
                return icon;
            }

            static void rl(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        @RequiresApi
        static class Api28Impl {
            static Parcelable rl(android.app.Person person) {
                return person;
            }

            static Notification.Builder n(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }
        }

        @RequiresApi
        static class Api31Impl {
            static Notification.CallStyle J2(Notification.CallStyle callStyle, boolean z2) {
                return callStyle.setIsVideo(z2);
            }

            static Notification.CallStyle KN(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }

            static Notification.CallStyle O(Notification.CallStyle callStyle, @ColorInt int i2) {
                return callStyle.setDeclineButtonColorHint(i2);
            }

            static Notification.CallStyle Uo(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle n(android.app.Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle nr(Notification.CallStyle callStyle, @ColorInt int i2) {
                return callStyle.setAnswerButtonColorHint(i2);
            }

            static Notification.CallStyle rl(android.app.Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle t(android.app.Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }
        }

        private Action az() {
            int i2 = R.drawable.f36147t;
            PendingIntent pendingIntent = this.nr;
            return pendingIntent == null ? gh(i2, R.string.nr, this.KN, R.color.rl, this.f36279O) : gh(i2, R.string.f36176t, this.KN, R.color.rl, pendingIntent);
        }

        private Action gh(int i2, int i3, Integer num, int i5, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(ContextCompat.getColor(this.mBuilder.f36274n, i5));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.f36274n.getResources().getString(i3));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action actionN = new Action.Builder(IconCompat.mUb(this.mBuilder.f36274n, i2), spannableStringBuilder, pendingIntent).n();
            actionN.t().putBoolean("key_action_priority", true);
            return actionN;
        }

        private boolean mUb(Action action) {
            return action != null && action.t().getBoolean("key_action_priority");
        }

        private Action qie() {
            int i2 = R.drawable.rl;
            int i3 = R.drawable.f36146n;
            PendingIntent pendingIntent = this.f36281t;
            if (pendingIntent == null) {
                return null;
            }
            boolean z2 = this.J2;
            return gh(z2 ? i2 : i3, z2 ? R.string.rl : R.string.f36175n, this.Uo, R.color.f36142n, pendingIntent);
        }

        private String xMQ() {
            int i2 = this.f36280n;
            if (i2 == 1) {
                return this.mBuilder.f36274n.getResources().getString(R.string.f36174O);
            }
            if (i2 == 2) {
                return this.mBuilder.f36274n.getResources().getString(R.string.J2);
            }
            if (i2 != 3) {
                return null;
            }
            return this.mBuilder.f36274n.getResources().getString(R.string.Uo);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequenceXMQ = null;
            callStyleN = null;
            Notification.CallStyle callStyleN = null;
            charSequenceXMQ = null;
            if (i2 < 31) {
                Notification.Builder builderN = notificationBuilderWithBuilderAccessor.n();
                Person person = this.rl;
                builderN.setContentTitle(person != null ? person.O() : null);
                Bundle bundle = this.mBuilder.E2;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceXMQ = this.mBuilder.E2.getCharSequence("android.text");
                }
                if (charSequenceXMQ == null) {
                    charSequenceXMQ = xMQ();
                }
                builderN.setContentText(charSequenceXMQ);
                Person person2 = this.rl;
                if (person2 != null) {
                    if (person2.t() != null) {
                        Api23Impl.rl(builderN, this.rl.t().aYN(this.mBuilder.f36274n));
                    }
                    if (i2 >= 28) {
                        Api28Impl.n(builderN, this.rl.mUb());
                    } else {
                        Api21Impl.n(builderN, this.rl.J2());
                    }
                }
                Api21Impl.rl(builderN, "call");
                return;
            }
            int i3 = this.f36280n;
            if (i3 == 1) {
                callStyleN = Api31Impl.n(this.rl.mUb(), this.nr, this.f36281t);
            } else if (i3 == 2) {
                callStyleN = Api31Impl.rl(this.rl.mUb(), this.f36279O);
            } else if (i3 == 3) {
                callStyleN = Api31Impl.t(this.rl.mUb(), this.f36279O, this.f36281t);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f36280n));
            }
            if (callStyleN != null) {
                callStyleN.setBuilder(notificationBuilderWithBuilderAccessor.n());
                Integer num = this.Uo;
                if (num != null) {
                    Api31Impl.nr(callStyleN, num.intValue());
                }
                Integer num2 = this.KN;
                if (num2 != null) {
                    Api31Impl.O(callStyleN, num2.intValue());
                }
                Api31Impl.KN(callStyleN, this.mUb);
                IconCompat iconCompat = this.xMQ;
                if (iconCompat != null) {
                    Api31Impl.Uo(callStyleN, iconCompat.aYN(this.mBuilder.f36274n));
                }
                Api31Impl.J2(callStyleN, this.J2);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList KN() {
            Action actionAz = az();
            Action actionQie = qie();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(actionAz);
            ArrayList<Action> arrayList2 = this.mBuilder.rl;
            int i2 = 2;
            if (arrayList2 != null) {
                for (Action action : arrayList2) {
                    if (action.mUb()) {
                        arrayList.add(action);
                    } else if (!mUb(action) && i2 > 1) {
                        arrayList.add(action);
                        i2--;
                    }
                    if (actionQie != null && i2 == 1) {
                        arrayList.add(actionQie);
                        i2--;
                    }
                }
            }
            if (actionQie != null && i2 >= 1) {
                arrayList.add(actionQie);
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt("android.callType", this.f36280n);
            bundle.putBoolean("android.callIsVideo", this.J2);
            Person person = this.rl;
            if (person != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", Api28Impl.rl(person.mUb()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", person.gh());
                }
            }
            IconCompat iconCompat = this.xMQ;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", Api23Impl.n(iconCompat.aYN(this.mBuilder.f36274n)));
            }
            bundle.putCharSequence("android.verificationText", this.mUb);
            bundle.putParcelable("android.answerIntent", this.f36281t);
            bundle.putParcelable("android.declineIntent", this.nr);
            bundle.putParcelable("android.hangUpIntent", this.f36279O);
            Integer num = this.Uo;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.KN;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            Integer numValueOf;
            super.restoreFromCompatExtras(bundle);
            this.f36280n = bundle.getInt("android.callType");
            this.J2 = bundle.getBoolean("android.callIsVideo");
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
                this.rl = Person.n(fuX.n(bundle.getParcelable("android.callPerson")));
            } else if (bundle.containsKey("android.callPersonCompat")) {
                this.rl = Person.rl(bundle.getBundle("android.callPersonCompat"));
            }
            if (bundle.containsKey("android.verificationIcon")) {
                this.xMQ = IconCompat.t((Icon) bundle.getParcelable("android.verificationIcon"));
            } else if (bundle.containsKey("android.verificationIconCompat")) {
                this.xMQ = IconCompat.rl(bundle.getBundle("android.verificationIconCompat"));
            }
            this.mUb = bundle.getCharSequence("android.verificationText");
            this.f36281t = (PendingIntent) bundle.getParcelable("android.answerIntent");
            this.nr = (PendingIntent) bundle.getParcelable("android.declineIntent");
            this.f36279O = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
            Integer numValueOf2 = null;
            if (bundle.containsKey("android.answerColor")) {
                numValueOf = Integer.valueOf(bundle.getInt("android.answerColor"));
            } else {
                numValueOf = null;
            }
            this.Uo = numValueOf;
            if (bundle.containsKey("android.declineColor")) {
                numValueOf2 = Integer.valueOf(bundle.getInt("android.declineColor"));
            }
            this.KN = numValueOf2;
        }
    }

    public static final class CarExtender implements Extender {

        @RequiresApi
        static class Api20Impl {
        }

        @RequiresApi
        static class Api29Impl {
        }

        @Deprecated
        public static class UnreadConversation {

            public static class Builder {
            }
        }
    }

    public static class DecoratedCustomViewStyle extends Style {

        @RequiresApi
        static class Api24Impl {
            static Notification.Style n() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.n().setStyle(Api24Impl.n());
        }
    }

    public interface Extender {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GroupAlertBehavior {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static class InboxStyle extends Style {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ArrayList f36282n = new ArrayList();

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor.n()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator it = this.f36282n.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove("android.textLines");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f36282n.clear();
            String str = esLNYym.mSjjcQhmAZi;
            if (bundle.containsKey(str)) {
                Collections.addAll(this.f36282n, bundle.getCharSequenceArray(str));
            }
        }
    }

    public static class MessagingStyle extends Style {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Boolean f36283O;
        private CharSequence nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Person f36285t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f36284n = new ArrayList();
        private final List rl = new ArrayList();

        @RequiresApi
        static class Api24Impl {
            static Notification.MessagingStyle rl(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle n(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle t(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        @RequiresApi
        static class Api28Impl {
            static Notification.MessagingStyle n(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle rl(Notification.MessagingStyle messagingStyle, boolean z2) {
                return messagingStyle.setGroupConversation(z2);
            }
        }

        public static final class Message {
            private Uri J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private String f36286O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final CharSequence f36287n;
            private Bundle nr = new Bundle();
            private final long rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final Person f36288t;

            @RequiresApi
            static class Api24Impl {
                static Notification.MessagingStyle.Message n(CharSequence charSequence, long j2, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j2, charSequence2);
                }

                static Notification.MessagingStyle.Message rl(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            @RequiresApi
            static class Api28Impl {
                static Parcelable n(android.app.Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message rl(CharSequence charSequence, long j2, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j2, person);
                }
            }

            static List J2(Parcelable[] parcelableArr) {
                Message messageO;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (messageO = O((Bundle) parcelable)) != null) {
                        arrayList.add(messageO);
                    }
                }
                return arrayList;
            }

            static Message O(Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        Message message = new Message(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? Person.rl(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new Person.Builder().J2(bundle.getCharSequence("sender")).n() : null : Person.n(fuX.n(bundle.getParcelable("sender_person"))));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            message.mUb(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            message.nr().putAll(bundle.getBundle("extras"));
                        }
                        return message;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            private Bundle qie() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f36287n;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.rl);
                Person person = this.f36288t;
                if (person != null) {
                    bundle.putCharSequence("sender", person.O());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", Api28Impl.n(this.f36288t.mUb()));
                    } else {
                        bundle.putBundle("person", this.f36288t.gh());
                    }
                }
                String str = this.f36286O;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.J2;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.nr;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public CharSequence KN() {
                return this.f36287n;
            }

            public Person Uo() {
                return this.f36288t;
            }

            public Message mUb(String str, Uri uri) {
                this.f36286O = str;
                this.J2 = uri;
                return this;
            }

            public Bundle nr() {
                return this.nr;
            }

            public String rl() {
                return this.f36286O;
            }

            public Uri t() {
                return this.J2;
            }

            public long xMQ() {
                return this.rl;
            }

            public Message(CharSequence charSequence, long j2, Person person) {
                this.f36287n = charSequence;
                this.rl = j2;
                this.f36288t = person;
            }

            static Bundle[] n(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bundleArr[i2] = ((Message) list.get(i2)).qie();
                }
                return bundleArr;
            }

            Notification.MessagingStyle.Message gh() {
                Notification.MessagingStyle.Message messageN;
                Person personUo = Uo();
                CharSequence charSequenceO = null;
                android.app.Person personMUb = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence charSequenceKN = KN();
                    long jXMQ = xMQ();
                    if (personUo != null) {
                        personMUb = personUo.mUb();
                    }
                    messageN = Api28Impl.rl(charSequenceKN, jXMQ, personMUb);
                } else {
                    CharSequence charSequenceKN2 = KN();
                    long jXMQ2 = xMQ();
                    if (personUo != null) {
                        charSequenceO = personUo.O();
                    }
                    messageN = Api24Impl.n(charSequenceKN2, jXMQ2, charSequenceO);
                }
                if (rl() != null) {
                    Api24Impl.rl(messageN, rl(), t());
                }
                return messageN;
            }
        }

        @RequiresApi
        static class Api26Impl {
            static Notification.MessagingStyle n(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        public boolean KN() {
            Builder builder = this.mBuilder;
            if (builder != null && builder.f36274n.getApplicationInfo().targetSdkVersion < 28 && this.f36283O == null) {
                return this.nr != null;
            }
            Boolean bool = this.f36283O;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        MessagingStyle() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f36285t.O());
            bundle.putBundle("android.messagingStyleUser", this.f36285t.gh());
            bundle.putCharSequence("android.hiddenConversationTitle", this.nr);
            if (this.nr != null && this.f36283O.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.nr);
            }
            if (!this.f36284n.isEmpty()) {
                bundle.putParcelableArray("android.messages", Message.n(this.f36284n));
            }
            if (!this.rl.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", Message.n(this.rl));
            }
            Boolean bool = this.f36283O;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.MessagingStyle messagingStyleRl;
            xMQ(KN());
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyleRl = Api28Impl.n(this.f36285t.mUb());
            } else {
                messagingStyleRl = Api24Impl.rl(this.f36285t.O());
            }
            Iterator it = this.f36284n.iterator();
            while (it.hasNext()) {
                Api24Impl.n(messagingStyleRl, ((Message) it.next()).gh());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.rl.iterator();
                while (it2.hasNext()) {
                    Api26Impl.n(messagingStyleRl, ((Message) it2.next()).gh());
                }
            }
            if (this.f36283O.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                Api24Impl.t(messagingStyleRl, this.nr);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Api28Impl.rl(messagingStyleRl, this.f36283O.booleanValue());
            }
            messagingStyleRl.setBuilder(notificationBuilderWithBuilderAccessor.n());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f36284n.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f36285t = Person.rl(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.f36285t = new Person.Builder().J2(bundle.getString("android.selfDisplayName")).n();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.nr = charSequence;
            if (charSequence == null) {
                this.nr = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f36284n.addAll(Message.J2(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.rl.addAll(Message.J2(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f36283O = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public MessagingStyle xMQ(boolean z2) {
            this.f36283O = Boolean.valueOf(z2);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StreamType {
    }

    public static abstract class Style {
        CharSequence mBigContentTitle;

        @RestrictTo
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        private static float rl(float f3, float f4, float f5) {
            return f3 < f4 ? f4 : f3 > f5 ? f5 : f3;
        }

        private static Style t(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new MessagingStyle();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new DecoratedCustomViewStyle();
            }
            return null;
        }

        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @RestrictTo
        public Bitmap createColoredBitmap(int i2, int i3) {
            return nr(i2, i3, 0);
        }

        @RestrictTo
        public boolean displayCustomViewInline() {
            return false;
        }

        @RestrictTo
        protected String getClassName() {
            return null;
        }

        @RestrictTo
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RequiresApi
        static class Api24Impl {
            static void n(RemoteViews remoteViews, int i2, boolean z2) {
                remoteViews.setChronometerCountDown(i2, z2);
            }
        }

        private Bitmap J2(int i2, int i3, int i5, int i7) {
            int i8 = R.drawable.nr;
            if (i7 == 0) {
                i7 = 0;
            }
            Bitmap bitmapNr = nr(i8, i7, i3);
            Canvas canvas = new Canvas(bitmapNr);
            Drawable drawableMutate = this.mBuilder.f36274n.getResources().getDrawable(i2).mutate();
            drawableMutate.setFilterBitmap(true);
            int i9 = (i3 - i5) / 2;
            int i10 = i5 + i9;
            drawableMutate.setBounds(i9, i9, i10, i10);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapNr;
        }

        private Bitmap O(IconCompat iconCompat, int i2, int i3) {
            Drawable drawableO = iconCompat.o(this.mBuilder.f36274n);
            int intrinsicWidth = i3 == 0 ? drawableO.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawableO.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
            drawableO.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawableO.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            drawableO.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private void Uo(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.f36167k, 8);
            remoteViews.setViewVisibility(R.id.Nxk, 8);
            remoteViews.setViewVisibility(R.id.f36152GR, 8);
        }

        static Style constructCompatStyleByName(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new DecoratedCustomViewStyle();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new BigPictureStyle();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new CallStyle();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new InboxStyle();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new BigTextStyle();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new MessagingStyle();
                default:
                    return null;
            }
        }

        static Style constructCompatStyleForBundle(Bundle bundle) {
            Style styleConstructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return styleConstructCompatStyleByName != null ? styleConstructCompatStyleByName : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new MessagingStyle() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new BigPictureStyle() : bundle.containsKey("android.bigText") ? new BigTextStyle() : bundle.containsKey("android.textLines") ? new InboxStyle() : bundle.containsKey("android.callType") ? new CallStyle() : t(bundle.getString("android.template"));
        }

        private int n() {
            Resources resources = this.mBuilder.f36274n.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.xMQ);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mUb);
            float fRl = (rl(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fRl) * dimensionPixelSize) + (fRl * dimensionPixelSize2));
        }

        private Bitmap nr(int i2, int i3, int i5) {
            return O(IconCompat.mUb(this.mBuilder.f36274n, i2), i3, i5);
        }

        @RestrictTo
        public void addCompatExtras(Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence("android.summaryText", this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
        @RestrictTo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RemoteViews applyStandardTemplate(boolean z2, int i2, boolean z3) {
            boolean z4;
            boolean z5;
            CharSequence charSequence;
            Resources resources = this.mBuilder.f36274n.getResources();
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.f36274n.getPackageName(), i2);
            this.mBuilder.J2();
            Builder builder = this.mBuilder;
            if (builder.mUb != null) {
                int i3 = R.id.f36156N;
                remoteViews.setViewVisibility(i3, 0);
                remoteViews.setImageViewBitmap(i3, createColoredBitmap(this.mBuilder.mUb, 0));
                if (z2 && this.mBuilder.p5.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f36143O);
                    int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.J2) * 2);
                    Builder builder2 = this.mBuilder;
                    Bitmap bitmapJ2 = J2(builder2.p5.icon, dimensionPixelSize, dimensionPixelSize2, builder2.nr());
                    int i5 = R.id.bzg;
                    remoteViews.setImageViewBitmap(i5, bitmapJ2);
                    remoteViews.setViewVisibility(i5, 0);
                }
            } else if (z2 && builder.p5.icon != 0) {
                int i7 = R.id.f36156N;
                remoteViews.setViewVisibility(i7, 0);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.nr) - resources.getDimensionPixelSize(R.dimen.f36145t);
                int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.Uo);
                Builder builder3 = this.mBuilder;
                remoteViews.setImageViewBitmap(i7, J2(builder3.p5.icon, dimensionPixelSize3, dimensionPixelSize4, builder3.nr()));
            }
            CharSequence charSequence2 = this.mBuilder.f36266O;
            if (charSequence2 != null) {
                remoteViews.setTextViewText(R.id.f36167k, charSequence2);
            }
            CharSequence charSequence3 = this.mBuilder.J2;
            boolean z6 = true;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(R.id.f36152GR, charSequence3);
                z4 = true;
            } else {
                z4 = false;
            }
            Builder builder4 = this.mBuilder;
            CharSequence charSequence4 = builder4.gh;
            if (charSequence4 != null) {
                int i8 = R.id.nHg;
                remoteViews.setTextViewText(i8, charSequence4);
                remoteViews.setViewVisibility(i8, 0);
            } else {
                if (builder4.qie <= 0) {
                    remoteViews.setViewVisibility(R.id.nHg, 8);
                    z5 = false;
                    charSequence = this.mBuilder.f36276r;
                    if (charSequence != null) {
                        int i9 = R.id.f36152GR;
                        remoteViews.setTextViewText(i9, charSequence);
                        CharSequence charSequence5 = this.mBuilder.J2;
                        if (charSequence5 != null) {
                            int i10 = R.id.Nxk;
                            remoteViews.setTextViewText(i10, charSequence5);
                            remoteViews.setViewVisibility(i10, 0);
                            if (z3) {
                                remoteViews.setTextViewTextSize(i9, 0, resources.getDimensionPixelSize(R.dimen.KN));
                            }
                            remoteViews.setViewPadding(R.id.s7N, 0, 0, 0, 0);
                        } else {
                            remoteViews.setViewVisibility(R.id.Nxk, 8);
                        }
                    }
                    if (this.mBuilder.Uo() != 0) {
                        z6 = z5;
                    } else if (this.mBuilder.HI) {
                        int i11 = R.id.f36159T;
                        remoteViews.setViewVisibility(i11, 0);
                        remoteViews.setLong(i11, "setBase", this.mBuilder.Uo() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                        remoteViews.setBoolean(i11, "setStarted", true);
                        boolean z7 = this.mBuilder.ck;
                        if (z7) {
                            Api24Impl.n(remoteViews, i11, z7);
                        }
                    } else {
                        int i12 = R.id.f36162Y;
                        remoteViews.setViewVisibility(i12, 0);
                        remoteViews.setLong(i12, "setTime", this.mBuilder.Uo());
                    }
                    remoteViews.setViewVisibility(R.id.Xw, !z6 ? 0 : 8);
                    remoteViews.setViewVisibility(R.id.wTp, z4 ? 0 : 8);
                    return remoteViews;
                }
                if (this.mBuilder.qie > resources.getInteger(R.integer.f36173n)) {
                    remoteViews.setTextViewText(R.id.nHg, resources.getString(R.string.KN));
                } else {
                    remoteViews.setTextViewText(R.id.nHg, NumberFormat.getIntegerInstance().format(this.mBuilder.qie));
                }
                remoteViews.setViewVisibility(R.id.nHg, 0);
            }
            z4 = true;
            z5 = true;
            charSequence = this.mBuilder.f36276r;
            if (charSequence != null) {
            }
            if (this.mBuilder.Uo() != 0) {
            }
            remoteViews.setViewVisibility(R.id.Xw, !z6 ? 0 : 8);
            remoteViews.setViewVisibility(R.id.wTp, z4 ? 0 : 8);
            return remoteViews;
        }

        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.t();
            }
            return null;
        }

        @RestrictTo
        protected void clearCompatExtraKeys(Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        Bitmap createColoredBitmap(IconCompat iconCompat, int i2) {
            return O(iconCompat, i2, 0);
        }

        @RestrictTo
        protected void restoreFromCompatExtras(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.mSummaryText = bundle.getCharSequence("android.summaryText");
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence("android.title.big");
        }

        public void setBuilder(Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.fD(this);
                }
            }
        }

        static Style constructStyleForExtras(Bundle bundle) {
            Style styleConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (styleConstructCompatStyleForBundle == null) {
                return null;
            }
            try {
                styleConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return styleConstructCompatStyleForBundle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @RestrictTo
        public static Style extractStyleFromNotification(Notification notification) {
            Bundle bundleN = NotificationCompat.n(notification);
            if (bundleN == null) {
                return null;
            }
            return constructStyleForExtras(bundleN);
        }

        @RestrictTo
        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            Uo(remoteViews);
            int i2 = R.id.f36172v;
            remoteViews.removeAllViews(i2);
            remoteViews.addView(i2, remoteViews2.clone());
            remoteViews.setViewVisibility(i2, 0);
            remoteViews.setViewPadding(R.id.rV9, 0, n(), 0, 0);
        }
    }

    public static final class TvExtender implements Extender {
    }

    public static final class WearableExtender implements Extender {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Bitmap f36289O;
        private String az;
        private int mUb;
        private int qie;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private PendingIntent f36291t;
        private String ty;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ArrayList f36290n = new ArrayList();
        private int rl = 1;
        private ArrayList nr = new ArrayList();
        private int Uo = 8388613;
        private int KN = -1;
        private int xMQ = 0;
        private int gh = 80;

        @RequiresApi
        static class Api20Impl {
        }

        @RequiresApi
        static class Api23Impl {
        }

        @RequiresApi
        static class Api24Impl {
        }

        @RequiresApi
        static class Api31Impl {
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public WearableExtender clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.f36290n = new ArrayList(this.f36290n);
            wearableExtender.rl = this.rl;
            wearableExtender.f36291t = this.f36291t;
            wearableExtender.nr = new ArrayList(this.nr);
            wearableExtender.f36289O = this.f36289O;
            wearableExtender.J2 = this.J2;
            wearableExtender.Uo = this.Uo;
            wearableExtender.KN = this.KN;
            wearableExtender.xMQ = this.xMQ;
            wearableExtender.mUb = this.mUb;
            wearableExtender.gh = this.gh;
            wearableExtender.qie = this.qie;
            wearableExtender.az = this.az;
            wearableExtender.ty = this.ty;
            return wearableExtender;
        }
    }

    public static Bundle n(Notification notification) {
        return notification.extras;
    }

    public static Bitmap rl(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.rl);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f36144n);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }
}
