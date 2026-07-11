package pUk;

import com.google.firebase.Timestamp;
import com.google.protobuf.RGN;
import uB.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class s4 {
    public static boolean t(uB.s4 s4Var) {
        uB.s4 s4VarAz = s4Var != null ? s4Var.g().az("__type__", null) : null;
        return s4VarAz != null && "server_timestamp".equals(s4VarAz.iF());
    }

    public static RGN n(uB.s4 s4Var) {
        return s4Var.g().ty("__local_write_time__").fD();
    }

    public static uB.s4 nr(Timestamp timestamp, uB.s4 s4Var) {
        uB.s4 s4Var2 = (uB.s4) uB.s4.X().Z("server_timestamp").build();
        eO.n nVarGh = uB.eO.r().gh("__type__", s4Var2).gh("__local_write_time__", (uB.s4) uB.s4.X().XQ(RGN.newBuilder().setSeconds(timestamp.getSeconds()).setNanos(timestamp.getNanoseconds())).build());
        if (t(s4Var)) {
            s4Var = rl(s4Var);
        }
        if (s4Var != null) {
            nVarGh.gh("__previous_value__", s4Var);
        }
        return (uB.s4) uB.s4.X().ck(nVarGh).build();
    }

    public static uB.s4 rl(uB.s4 s4Var) {
        uB.s4 s4VarAz = s4Var.g().az("__previous_value__", null);
        if (t(s4VarAz)) {
            return rl(s4VarAz);
        }
        return s4VarAz;
    }
}
