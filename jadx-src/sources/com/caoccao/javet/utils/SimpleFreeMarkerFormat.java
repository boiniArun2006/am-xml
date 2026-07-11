package com.caoccao.javet.utils;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class SimpleFreeMarkerFormat {
    private static final char CHAR_DOLLAR = '$';
    private static final char CHAR_VARIABLE_CLOSE = '}';
    private static final char CHAR_VARIABLE_OPEN = '{';
    public static final String STRING_NULL = "<null>";

    enum State {
        Text,
        Dollar,
        Variable
    }

    /* JADX INFO: renamed from: com.caoccao.javet.utils.SimpleFreeMarkerFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$utils$SimpleFreeMarkerFormat$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$caoccao$javet$utils$SimpleFreeMarkerFormat$State = iArr;
            try {
                iArr[State.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$utils$SimpleFreeMarkerFormat$State[State.Dollar.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caoccao$javet$utils$SimpleFreeMarkerFormat$State[State.Variable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SimpleFreeMarkerFormat() {
    }

    public static String format(String str, Map<String, Object> map) {
        if (!StringUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            State state = State.Text;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '$') {
                    if (cCharAt != '{') {
                        if (cCharAt != '}') {
                            int i3 = AnonymousClass1.$SwitchMap$com$caoccao$javet$utils$SimpleFreeMarkerFormat$State[state.ordinal()];
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    sb.append(cCharAt);
                                } else {
                                    sb2.append(cCharAt);
                                }
                            } else {
                                state = State.Text;
                                sb.append('$');
                                sb.append(cCharAt);
                            }
                        } else if (state == State.Variable) {
                            Object obj = map.get(sb2.toString());
                            if (obj == null) {
                                obj = STRING_NULL;
                            }
                            sb.append(obj);
                            sb2.setLength(0);
                            state = State.Text;
                        } else {
                            sb.append(cCharAt);
                        }
                    } else {
                        int i5 = AnonymousClass1.$SwitchMap$com$caoccao$javet$utils$SimpleFreeMarkerFormat$State[state.ordinal()];
                        if (i5 != 2) {
                            if (i5 != 3) {
                                state = State.Text;
                                sb.append(cCharAt);
                            } else {
                                sb2.append(cCharAt);
                            }
                        } else {
                            state = State.Variable;
                        }
                    }
                } else {
                    int i7 = AnonymousClass1.$SwitchMap$com$caoccao$javet$utils$SimpleFreeMarkerFormat$State[state.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                sb2.append(cCharAt);
                            }
                        } else {
                            state = State.Text;
                            sb.append('$');
                            sb.append(cCharAt);
                        }
                    } else {
                        state = State.Dollar;
                    }
                }
            }
            int i8 = AnonymousClass1.$SwitchMap$com$caoccao$javet$utils$SimpleFreeMarkerFormat$State[state.ordinal()];
            if (i8 != 2) {
                if (i8 == 3) {
                    sb.append('$');
                    sb.append(CHAR_VARIABLE_OPEN);
                    sb.append((CharSequence) sb2);
                }
            } else {
                sb.append('$');
            }
            return sb.toString();
        }
        return str;
    }
}
