package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements com.facebook.Dsr {
    public static final n rl = new n(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Map f52704t = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f52705n = new HashMap();

    public interface j {
        boolean n(int i2, Intent intent);
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized j rl(int i2) {
            return (j) Ml.f52704t.get(Integer.valueOf(i2));
        }

        public final synchronized void t(int i2, j callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (Ml.f52704t.containsKey(Integer.valueOf(i2))) {
                return;
            }
            Ml.f52704t.put(Integer.valueOf(i2), callback);
        }

        private n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean nr(int i2, int i3, Intent intent) {
            j jVarRl = rl(i2);
            if (jVarRl != null) {
                return jVarRl.n(i3, intent);
            }
            return false;
        }
    }

    public enum w6 {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f52719n;

        w6(int i2) {
            this.f52719n = i2;
        }

        public final int rl() {
            return com.facebook.s4.Ik() + this.f52719n;
        }
    }

    @Override // com.facebook.Dsr
    public boolean onActivityResult(int i2, int i3, Intent intent) {
        j jVar = (j) this.f52705n.get(Integer.valueOf(i2));
        return jVar != null ? jVar.n(i3, intent) : rl.nr(i2, i3, intent);
    }

    public final void rl(int i2, j callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f52705n.put(Integer.valueOf(i2), callback);
    }

    public final void t(int i2) {
        this.f52705n.remove(Integer.valueOf(i2));
    }
}
