/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003, LAMP/EPFL                  **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
** $Id$
\*                                                                      */

package scala.collection.mutable;

/** This class implements mutable maps using a hashtable.
 *
 *  @author  Matthias Zenger
 *  @version 1.0, 08/07/2003
 */
class HashMap[A, B] extends scala.collection.mutable.Map[A, B]
                    with HashTable[A]
                    with DefaultMapModel[A, B] {

    protected def entryKey(e: Entry) = e.key;

    override def clear = {
        initTable(table.length - 1);
        tableSize = 0;
    }
}
