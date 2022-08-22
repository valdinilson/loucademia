package eng.valdinilson.loucademia.application.util;

import org.apache.commons.lang3.StringUtils;

public class Validation {
    private Validation() {
        throw new IllegalStateException("Utility class");
    }

    public static void assertNotEmpty(Object obj) throws ValidationException {
        if (obj instanceof String) {
            String s = (String) obj;
            if (StringUtils.isEmpty(s)) {
                throw new ValidationException("Valor não pode ser vazio");
            }
        }

        if (obj == null) {
            throw new ValidationException("Valor não pode ser nulo");
        }
    }
}
