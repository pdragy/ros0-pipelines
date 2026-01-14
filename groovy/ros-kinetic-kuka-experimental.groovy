node {
    git url: 'https://github.com/ros-industrial/kuka_experimental.git', branch: 'melodic-devel'
    registerROS('ros:kinetic-desktop', [
        'ros-kinetic-controller-manager',
        'ros-kinetic-industrial-robot-client',
        'ros-kinetic-joint-limits-interface',
        'ros-kinetic-realtime-tools'
    ], [])
}
