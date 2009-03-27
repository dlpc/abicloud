/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in 
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 * 
 * Software distributed under the License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * 
 * The Original Code is available at http://www.abiquo.com/.....
 * 
 * The Initial Developer of the Original Code is Soluciones Grid, S.L. (www.abiquo.com),
 * Consell de Cent 296, Principal 2�, 08007 Barcelona, Spain.
 * 
 * No portions of the Code have been created by third parties. 
 * All Rights Reserved.
 * 
 * Contributor(s): ______________________________________.
 * 
 * Graphical User Interface of this software may be used under the terms
 * of the Common Public Attribution License Version 1.0 (the  "CPAL License", 
 * available at http://cpal.abiquo.com/), in which case the 
 * provisions of CPAL License are applicable instead of those above. In relation 
 * of this portions of the Code, a Legal Notice according to Exhibits A and B of 
 * CPAL Licence should be provided in any distribution of the corresponding Code 
 * to Graphical User Interface.
 */
package com.abiquo.abiserver.services.flex;

import com.abiquo.abiserver.business.locators.resource.ResourceLocator;
import com.abiquo.abiserver.commands.LoginCommand;
import com.abiquo.abiserver.pojo.authentication.Login;
import com.abiquo.abiserver.pojo.authentication.UserSession;
import com.abiquo.abiserver.pojo.result.BasicResult;

/**
 * This class defines all services related to login and logout processes
 * 
 * @author Oliver
 */

public class LoginService
{
    /**
     * Performs a login action against the Authentication Manager
     * 
     * @param loginData
     * @return If login was successfully, a DataResult<LoginResult> object, contain the user's
     *         session, data and client resources If not, a BasicResult object, with the error
     *         message
     */

    public BasicResult login(Login loginData)
    {
        Object[] args = new Object[1];
        args[0] = loginData;

        LoginCommand loginCommand = new LoginCommand();

        return loginCommand.execute(ResourceLocator.LOGIN_RESOURCE, args);
    }

    /**
     * Performs a logout action over a session
     * 
     * @param session
     * @return
     */
    public BasicResult logout(UserSession session)
    {
        Object[] args = new Object[1];
        args[0] = session;

        LoginCommand loginCommand = new LoginCommand();
        return loginCommand.execute(ResourceLocator.LOGOUT_RESOURCE, args);
    }
}
