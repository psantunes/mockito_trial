/**
 * VVS by Rodrigo Prestes Machado
 *
 * VVS is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
*/

package dev.vvs;

public interface DataBase {

    public String createUser(String name);

    public String readUser(Long id);

    public Boolean updateUser(Long id, String name);

    public Boolean deleteUser(Long id) throws IllegalArgumentException;

}
