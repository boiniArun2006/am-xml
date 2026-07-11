package io.grpc.internal;

import JP.r;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class eO {
    static final Logger J2 = Logger.getLogger(JP.Ml.class.getName());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f68469O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f68470n = new Object();
    private final long nr;
    private final JP.afx rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Collection f68471t;

    class j extends ArrayDeque {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68472n;

        j(int i2) {
            this.f68472n = i2;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public boolean add(JP.r rVar) {
            if (size() == this.f68472n) {
                removeFirst();
            }
            eO.n(eO.this);
            return super.add(rVar);
        }
    }

    static /* synthetic */ class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68474n;

        static {
            int[] iArr = new int[r.n.values().length];
            f68474n = iArr;
            try {
                iArr[r.n.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68474n[r.n.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static /* synthetic */ int n(eO eOVar) {
        int i2 = eOVar.f68469O;
        eOVar.f68469O = i2 + 1;
        return i2;
    }

    static void nr(JP.afx afxVar, Level level, String str) {
        Logger logger = J2;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + afxVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName(CreativeInfo.f62442f);
            logger.log(logRecord);
        }
    }

    void J2(JP.r rVar) {
        synchronized (this.f68470n) {
            try {
                Collection collection = this.f68471t;
                if (collection != null) {
                    collection.add(rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void O(JP.r rVar) {
        int i2 = n.f68474n[rVar.rl.ordinal()];
        Level level = i2 != 1 ? i2 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        J2(rVar);
        nr(this.rl, level, rVar.f4555n);
    }

    JP.afx rl() {
        return this.rl;
    }

    boolean t() {
        boolean z2;
        synchronized (this.f68470n) {
            z2 = this.f68471t != null;
        }
        return z2;
    }

    eO(JP.afx afxVar, int i2, long j2, String str) {
        t1.Xo.ck(str, "description");
        this.rl = (JP.afx) t1.Xo.ck(afxVar, "logId");
        if (i2 > 0) {
            this.f68471t = new j(i2);
        } else {
            this.f68471t = null;
        }
        this.nr = j2;
        O(new r.j().rl(str + " created").t(r.n.CT_INFO).O(j2).n());
    }
}
