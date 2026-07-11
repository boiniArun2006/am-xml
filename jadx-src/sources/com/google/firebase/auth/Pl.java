package com.google.firebase.auth;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzam;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Pl {
    private Activity J2;
    private MultiFactorSession KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f60129O;
    private PhoneAuthProvider.ForceResendingToken Uo;
    private boolean gh;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FirebaseAuth f60130n;
    private Executor nr;
    private boolean qie;
    private Long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PhoneAuthProvider.j f60131t;
    private PhoneMultiFactorInfo xMQ;

    public static final class j {
        private Activity J2;
        private MultiFactorSession KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Executor f60132O;
        private PhoneAuthProvider.ForceResendingToken Uo;
        private boolean mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FirebaseAuth f60133n;
        private PhoneAuthProvider.j nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Long f60134t;
        private PhoneMultiFactorInfo xMQ;

        public final j J2(Long l2, TimeUnit timeUnit) {
            this.f60134t = Long.valueOf(TimeUnit.SECONDS.convert(l2.longValue(), timeUnit));
            return this;
        }

        public final j O(String str) {
            this.rl = str;
            return this;
        }

        public final Pl n() {
            Preconditions.checkNotNull(this.f60133n, "FirebaseAuth instance cannot be null");
            Preconditions.checkNotNull(this.f60134t, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            Preconditions.checkNotNull(this.nr, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f60132O = this.f60133n.pJg();
            if (this.f60134t.longValue() < 0 || this.f60134t.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            MultiFactorSession multiFactorSession = this.KN;
            if (multiFactorSession == null) {
                Preconditions.checkNotEmpty(this.rl, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                Preconditions.checkArgument(!this.mUb, "You cannot require sms validation without setting a multi-factor session.");
                Preconditions.checkArgument(this.xMQ == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else if (multiFactorSession == null || !((zzam) multiFactorSession).zzd()) {
                Preconditions.checkArgument(this.xMQ != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                Preconditions.checkArgument(this.rl == null, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
            } else {
                Preconditions.checkNotEmpty(this.rl);
                Preconditions.checkArgument(this.xMQ == null, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
            }
            return new Pl(this.f60133n, this.f60134t, this.nr, this.f60132O, this.rl, this.J2, this.Uo, this.KN, this.xMQ, this.mUb);
        }

        public final j nr(PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            this.Uo = forceResendingToken;
            return this;
        }

        public final j rl(Activity activity) {
            this.J2 = activity;
            return this;
        }

        public final j t(PhoneAuthProvider.j jVar) {
            this.nr = jVar;
            return this;
        }

        public j(FirebaseAuth firebaseAuth) {
            this.f60133n = (FirebaseAuth) Preconditions.checkNotNull(firebaseAuth);
        }
    }

    public final void O(boolean z2) {
        this.qie = true;
    }

    public final void t(boolean z2) {
        this.gh = true;
    }

    private Pl(FirebaseAuth firebaseAuth, Long l2, PhoneAuthProvider.j jVar, Executor executor, String str, Activity activity, PhoneAuthProvider.ForceResendingToken forceResendingToken, MultiFactorSession multiFactorSession, PhoneMultiFactorInfo phoneMultiFactorInfo, boolean z2) {
        this.f60130n = firebaseAuth;
        this.f60129O = str;
        this.rl = l2;
        this.f60131t = jVar;
        this.J2 = activity;
        this.nr = executor;
        this.Uo = forceResendingToken;
        this.KN = multiFactorSession;
        this.xMQ = phoneMultiFactorInfo;
        this.mUb = z2;
    }

    public static j n(FirebaseAuth firebaseAuth) {
        return new j(firebaseAuth);
    }

    public final boolean HI() {
        return this.qie;
    }

    public final MultiFactorSession J2() {
        return this.KN;
    }

    public final PhoneAuthProvider.j KN() {
        return this.f60131t;
    }

    public final PhoneAuthProvider.ForceResendingToken Uo() {
        return this.Uo;
    }

    public final boolean az() {
        return this.gh;
    }

    public final boolean ck() {
        return this.KN != null;
    }

    public final String gh() {
        return this.f60129O;
    }

    public final Long mUb() {
        return this.rl;
    }

    public final FirebaseAuth nr() {
        return this.f60130n;
    }

    public final Executor qie() {
        return this.nr;
    }

    public final Activity rl() {
        return this.J2;
    }

    public final boolean ty() {
        return this.mUb;
    }

    public final PhoneMultiFactorInfo xMQ() {
        return this.xMQ;
    }
}
