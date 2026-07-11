package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class LEl {

    class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ fuX f59882n;

        j(fuX fux) {
            this.f59882n = fux;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.LEl.n
        public byte byteAt(int i2) {
            return this.f59882n.t(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.LEl.n
        public int size() {
            return this.f59882n.size();
        }
    }

    private interface n {
        byte byteAt(int i2);

        int size();
    }

    static String n(fuX fux) {
        return rl(new j(fux));
    }

    static String rl(n nVar) {
        StringBuilder sb = new StringBuilder(nVar.size());
        for (int i2 = 0; i2 < nVar.size(); i2++) {
            byte bByteAt = nVar.byteAt(i2);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String t(String str) {
        return n(fuX.KN(str));
    }
}
