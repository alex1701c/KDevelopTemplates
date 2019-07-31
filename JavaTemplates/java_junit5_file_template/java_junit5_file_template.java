{% if package and package != "none" %}

package {{ package }};

{% endif %}

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class {{ name }}Test {

{% if before_all_method %}


    @BeforeAll
    static void initAll() {
    }
{% endif %}

{% if before_each_method %}

    @BeforeEach
    void init() {
    }
{% endif %}

{% for test in testCases %}

    @Test
    void {{ test }}() {
    // TODO Implement
    }

{% endfor %}

{% if after_all_method %}
    @AfterEach
    void tearDown() {
    }
{% endif %}


{% if after_each_method %}
    @AfterAll
    static void tearDownAll() {
    }
{% endif %}


}