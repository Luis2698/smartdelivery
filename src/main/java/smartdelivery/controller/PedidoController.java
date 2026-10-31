/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdelivery.controller;

import smartdelivery.model.Pedido;
import smartdelivery.repository.PedidoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    private final PedidoRepository pedidoRepository;

    public PedidoController(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    // GET: Obtener todos los pedidos
    @GetMapping
    public List<Pedido> obtenerTodos() {
        return pedidoRepository.findAll();
    }

    // POST: Crear un nuevo pedido
    @PostMapping
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        if (pedido.getEstado() == null) {
            pedido.setEstado("CREADO");
        }
        if (pedido.getRepartidor() == null || pedido.getRepartidor().trim().isEmpty()) {
            pedido.setRepartidor("Sin Asignar");
        }
        return pedidoRepository.save(pedido);
    }

    // PUT CLAVE: Endpoint dedicado para asignar piloto/repartidor sin errores de deserialización
    @PutMapping("/{id}/repartidor")
    public ResponseEntity<Pedido> actualizarRepartidor(@PathVariable Long id, @RequestParam String repartidor) {
        return pedidoRepository.findById(id).map(pedido -> {
            pedido.setRepartidor(repartidor);
            Pedido pedidoActualizado = pedidoRepository.save(pedido);
            return ResponseEntity.ok(pedidoActualizado);
        }).orElse(ResponseEntity.notFound().build());
    }

    // PUT: Avanzar de estado (CREADO -> CONFIRMADO -> EN_PREPARACION -> etc.)
    @PutMapping("/{id}/estado")
    public ResponseEntity<Pedido> cambiarEstado(@PathVariable Long id, @RequestParam String estado) {
        return pedidoRepository.findById(id).map(pedido -> {
            pedido.setEstado(estado);
            Pedido pedidoActualizado = pedidoRepository.save(pedido);
            return ResponseEntity.ok(pedidoActualizado);
        }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE: Eliminar un pedido
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPedido(@PathVariable Long id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}