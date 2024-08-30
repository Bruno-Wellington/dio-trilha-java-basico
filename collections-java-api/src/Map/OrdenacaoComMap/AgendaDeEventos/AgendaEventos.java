package Map.OrdenacaoComMap.AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        //eventoMap.put(data, evento);
        //Simplificando
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        //Para organizar na ordem crescente, nao sera necessario usar a interface Comparable na classe evento, pois o LocalDate
        // implementa o metodo ChronoLocalDate que por sua vez extende a interface Comparable
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Atribui a data atual a variavel
        LocalDate dataAtual = LocalDate.now();
        //Traz os eventos com a data na ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            //Se a data(entry.getkey) for igual(isEqual) a data atual ou a data(entry.getkey) for depois(isAfter) da data atual
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento é [" + proximoEvento + "] e acontecerá na data " + proximaData);
                break;
            }
        }
    }
}
