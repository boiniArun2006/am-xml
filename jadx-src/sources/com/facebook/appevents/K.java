package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class K implements Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f52266t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f52267n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n implements Serializable {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f52268t = new j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final HashMap f52269n;

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }
        }

        public n(HashMap proxyEvents) {
            Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
            this.f52269n = proxyEvents;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new K(this.f52269n);
        }
    }

    public K() {
        this.f52267n = new HashMap();
    }

    public K(HashMap appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap map = new HashMap();
        this.f52267n = map;
        map.putAll(appEventMap);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return new n(this.f52267n);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final void n(com.facebook.appevents.j accessTokenAppIdPair, List appEvents) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                if (!this.f52267n.containsKey(accessTokenAppIdPair)) {
                    this.f52267n.put(accessTokenAppIdPair, CollectionsKt.toMutableList((Collection) appEvents));
                    return;
                }
                List list = (List) this.f52267n.get(accessTokenAppIdPair);
                if (list != null) {
                    list.addAll(appEvents);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final Set rl() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Set setEntrySet = this.f52267n.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "events.entries");
            return setEntrySet;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
