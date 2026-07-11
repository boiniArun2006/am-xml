package iWe;

import java.util.Iterator;
import java.util.Map;
import oK9.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Ml extends I28 {
    private static final yMa.j rl = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qz f68125n;

    private boolean HI(qz qzVar, int i2) {
        if (qzVar == null) {
            rl.mUb("TraceMetric is null");
            return false;
        }
        if (i2 > 1) {
            rl.mUb("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!Ik(qzVar.e())) {
            rl.mUb("invalid TraceId:" + qzVar.e());
            return false;
        }
        if (!ck(qzVar)) {
            rl.mUb("invalid TraceDuration:" + qzVar.iF());
            return false;
        }
        if (!qzVar.N()) {
            rl.mUb("clientStartTimeUs is null.");
            return false;
        }
        if (!gh(qzVar) || ty(qzVar)) {
            Iterator it = qzVar.T().iterator();
            while (it.hasNext()) {
                if (!HI((qz) it.next(), i2 + 1)) {
                    return false;
                }
            }
            return Uo(qzVar.g());
        }
        rl.mUb("non-positive totalFrames in screen trace " + qzVar.e());
        return false;
    }

    private boolean Ik(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    private boolean KN(qz qzVar) {
        return xMQ(qzVar, 0);
    }

    private boolean qie(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            rl.mUb("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        rl.mUb("counterId exceeded max length 100");
        return false;
    }

    private boolean xMQ(qz qzVar, int i2) {
        if (qzVar == null) {
            return false;
        }
        if (i2 > 1) {
            rl.mUb("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : qzVar.nY().entrySet()) {
            if (!qie((String) entry.getKey())) {
                rl.mUb("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            if (!az((Long) entry.getValue())) {
                rl.mUb("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator it = qzVar.T().iterator();
        while (it.hasNext()) {
            if (!xMQ((qz) it.next(), i2 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean az(Long l2) {
        return l2 != null;
    }

    private boolean ck(qz qzVar) {
        return qzVar != null && qzVar.iF() > 0;
    }

    @Override // iWe.I28
    public boolean t() {
        if (!HI(this.f68125n, 0)) {
            rl.mUb("Invalid Trace:" + this.f68125n.e());
            return false;
        }
        if (!mUb(this.f68125n) || KN(this.f68125n)) {
            return true;
        }
        rl.mUb("Invalid Counters for Trace:" + this.f68125n.e());
        return false;
    }

    Ml(qz qzVar) {
        this.f68125n = qzVar;
    }

    private boolean Uo(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                I28.nr((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e2) {
                rl.mUb(e2.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean gh(qz qzVar) {
        return qzVar.e().startsWith("_st_");
    }

    private boolean mUb(qz qzVar) {
        if (qzVar.ViF() > 0) {
            return true;
        }
        Iterator it = qzVar.T().iterator();
        while (it.hasNext()) {
            if (((qz) it.next()).ViF() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean ty(qz qzVar) {
        Long l2 = (Long) qzVar.nY().get(O2.n.FRAMES_TOTAL.toString());
        if (l2 != null && l2.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }
}
