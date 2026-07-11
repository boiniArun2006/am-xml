package io.grpc.internal;

import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import io.grpc.C;
import io.grpc.QJ;
import io.grpc.internal.j;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class P extends j.w6 {
    private static final C.j WPU;
    private static final QJ.CN3 aYN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f68352S;
    private Charset XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private io.grpc.QJ f68353Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.grpc.SPz f68354o;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class j implements C.j {
        @Override // io.grpc.QJ.aC
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Integer rl(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, io.grpc.C.f68152n));
        }

        @Override // io.grpc.QJ.aC
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public byte[] n(Integer num) {
            throw new UnsupportedOperationException();
        }

        j() {
        }
    }

    protected abstract void Xw(io.grpc.SPz sPz, boolean z2, io.grpc.QJ qj);

    static {
        j jVar = new j();
        WPU = jVar;
        aYN = io.grpc.C.rl(":status", jVar);
    }

    private static void U(io.grpc.QJ qj) {
        qj.O(aYN);
        qj.O(io.grpc.qz.rl);
        qj.O(io.grpc.qz.f68860n);
    }

    private static Charset bzg(io.grpc.QJ qj) {
        String str = (String) qj.Uo(psW.mUb);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return t1.I28.f73396t;
    }

    private io.grpc.SPz eF(io.grpc.QJ qj) {
        Integer num = (Integer) qj.Uo(aYN);
        if (num == null) {
            return io.grpc.SPz.f68187o.Ik("Missing HTTP status code");
        }
        String str = (String) qj.Uo(psW.mUb);
        if (psW.ty(str)) {
            return null;
        }
        return psW.az(num.intValue()).O("invalid content-type: " + str);
    }

    private io.grpc.SPz jB(io.grpc.QJ qj) {
        io.grpc.SPz sPz = (io.grpc.SPz) qj.Uo(io.grpc.qz.rl);
        if (sPz != null) {
            return sPz.Ik((String) qj.Uo(io.grpc.qz.f68860n));
        }
        if (this.f68352S) {
            return io.grpc.SPz.Uo.Ik("missing GRPC status in response");
        }
        Integer num = (Integer) qj.Uo(aYN);
        return (num != null ? psW.az(num.intValue()) : io.grpc.SPz.f68187o.Ik("missing HTTP status code")).O("missing GRPC status, inferred error from HTTP status code");
    }

    /* JADX WARN: Finally extract failed */
    protected void M7(io.grpc.QJ qj) {
        t1.Xo.ck(qj, "headers");
        io.grpc.SPz sPz = this.f68354o;
        if (sPz != null) {
            this.f68354o = sPz.O("headers: " + qj);
            return;
        }
        try {
            if (this.f68352S) {
                io.grpc.SPz sPzIk = io.grpc.SPz.f68187o.Ik(qUrazMnwDskFs.oSixEGx);
                this.f68354o = sPzIk;
                if (sPzIk != null) {
                    this.f68354o = sPzIk.O("headers: " + qj);
                    this.f68353Z = qj;
                    this.XQ = bzg(qj);
                    return;
                }
                return;
            }
            Integer num = (Integer) qj.Uo(aYN);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                io.grpc.SPz sPz2 = this.f68354o;
                if (sPz2 != null) {
                    this.f68354o = sPz2.O("headers: " + qj);
                    this.f68353Z = qj;
                    this.XQ = bzg(qj);
                    return;
                }
                return;
            }
            this.f68352S = true;
            io.grpc.SPz sPzEF = eF(qj);
            this.f68354o = sPzEF;
            if (sPzEF != null) {
                if (sPzEF != null) {
                    this.f68354o = sPzEF.O("headers: " + qj);
                    this.f68353Z = qj;
                    this.XQ = bzg(qj);
                    return;
                }
                return;
            }
            U(qj);
            E2(qj);
            io.grpc.SPz sPz3 = this.f68354o;
            if (sPz3 != null) {
                this.f68354o = sPz3.O("headers: " + qj);
                this.f68353Z = qj;
                this.XQ = bzg(qj);
            }
        } catch (Throwable th) {
            io.grpc.SPz sPz4 = this.f68354o;
            if (sPz4 != null) {
                this.f68354o = sPz4.O("headers: " + qj);
                this.f68353Z = qj;
                this.XQ = bzg(qj);
            }
            throw th;
        }
    }

    protected void P5(RGN rgn, boolean z2) throws Throwable {
        io.grpc.SPz sPz = this.f68354o;
        if (sPz != null) {
            this.f68354o = sPz.O("DATA-----------------------------\n" + B.O(rgn, this.XQ));
            rgn.close();
            if (this.f68354o.ty().length() > 1000 || z2) {
                Xw(this.f68354o, false, this.f68353Z);
                return;
            }
            return;
        }
        if (!this.f68352S) {
            Xw(io.grpc.SPz.f68187o.Ik("headers not received before payload"), false, new io.grpc.QJ());
            return;
        }
        int iNr = rgn.nr();
        fD(rgn);
        if (z2) {
            if (iNr > 0) {
                this.f68354o = io.grpc.SPz.f68187o.Ik("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f68354o = io.grpc.SPz.f68187o.Ik("Received unexpected EOS on empty DATA frame from server");
            }
            io.grpc.QJ qj = new io.grpc.QJ();
            this.f68353Z = qj;
            rV9(this.f68354o, false, qj);
        }
    }

    protected void p5(io.grpc.QJ qj) {
        t1.Xo.ck(qj, "trailers");
        if (this.f68354o == null && !this.f68352S) {
            io.grpc.SPz sPzEF = eF(qj);
            this.f68354o = sPzEF;
            if (sPzEF != null) {
                this.f68353Z = qj;
            }
        }
        io.grpc.SPz sPz = this.f68354o;
        if (sPz == null) {
            io.grpc.SPz sPzJB = jB(qj);
            U(qj);
            e(qj, sPzJB);
        } else {
            io.grpc.SPz sPzO = sPz.O("trailers: " + qj);
            this.f68354o = sPzO;
            Xw(sPzO, false, this.f68353Z);
        }
    }

    protected P(int i2, h6y h6yVar, Pp pp) {
        super(i2, h6yVar, pp);
        this.XQ = t1.I28.f73396t;
    }

    @Override // io.grpc.internal.j.w6, io.grpc.internal.xZD.n
    public /* bridge */ /* synthetic */ void O(boolean z2) {
        super.O(z2);
    }
}
