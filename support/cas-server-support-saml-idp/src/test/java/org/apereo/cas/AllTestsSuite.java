package org.apereo.cas;

import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.support.saml.SamlAttributeEncoderTests;
import org.apereo.cas.support.saml.SamlIdPConfigurationTests;
import org.apereo.cas.support.saml.SamlRegisteredServiceTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite to run all SAML tests.
 *
 * @author Misagh Moayyed
 * @since 4.2.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SamlRegisteredServiceTests.class, SamlIdPConfigurationTests.class,
        SamlAttributeEncoderTests.class
})
@Slf4j
public class AllTestsSuite {
}

